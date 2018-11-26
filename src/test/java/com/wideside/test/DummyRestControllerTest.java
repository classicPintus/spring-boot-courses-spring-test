package com.wideside.test;

import com.wideside.test.controller.CompleteClass;
import com.wideside.test.controller.DummyRestController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DummyRestControllerTest {
    
    @MockBean
    private DummyRestController dummyRestController;

    @Test
    public void testTestFranco() {
        given(dummyRestController.testFranco()).willReturn("gianni");
        assertThat(dummyRestController.testFranco()).isEqualTo("gianni");
    }

    @Test
    public void testTestCompleteClass() {
        CompleteClass cc = new CompleteClass();
        given(dummyRestController.testCompleteClass()).willReturn(cc);
        assertThat(dummyRestController.testCompleteClass()).isEqualTo(cc);
    }
    
}
