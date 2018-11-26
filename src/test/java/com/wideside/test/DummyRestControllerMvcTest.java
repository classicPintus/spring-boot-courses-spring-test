package com.wideside.test;

import com.wideside.test.controller.DummyRestController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.BDDMockito.given;

@RunWith(SpringRunner.class)
@WebMvcTest(DummyRestController.class)
public class DummyRestControllerMvcTest {
    
    @Autowired
    private MockMvc mvc;
    
    @MockBean
    private DummyRestController dummyRestController;

    @Test
    public void testTestFranco() throws Exception {
        given(dummyRestController.testFranco()).willReturn("gianni");
        
        mvc.perform(MockMvcRequestBuilders.get("/testFranco")
                .accept(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("gianni"));
    }
    
}
