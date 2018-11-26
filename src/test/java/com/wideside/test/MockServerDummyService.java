package com.wideside.test;

import com.wideside.test.service.DummyService;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.AutoConfigureMockRestServiceServer;
import org.springframework.boot.test.autoconfigure.web.client.AutoConfigureWebClient;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.test.web.client.match.MockRestRequestMatchers;
import org.springframework.test.web.client.response.MockRestResponseCreators;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

@RunWith(SpringRunner.class)
@RestClientTest(DummyService.class)
@AutoConfigureWebClient(registerRestTemplate=true)
public class MockServerDummyService {

    @Autowired
    private DummyService target;

    @Autowired
    private MockRestServiceServer server;

    @Test
    public void testMockServer(){
        server.expect(MockRestRequestMatchers.requestTo("http://www.google.it"))
            .andRespond(MockRestResponseCreators.withSuccess("hello", MediaType.TEXT_PLAIN));

        Assertions.assertThat(target.testMockServer()).isEqualTo("hello");

    }

}

