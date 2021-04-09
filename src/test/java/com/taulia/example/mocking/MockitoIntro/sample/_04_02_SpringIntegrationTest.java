package com.taulia.example.mocking.MockitoIntro.sample;

import com.taulia.example.mocking.MockitoIntro.services.DummyService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.when;

// To @Mock, or to @MockBean?

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class _04_02_SpringIntegrationTest {
//    @Mock
    @MockBean
    Dummy dummyMock;

    @Autowired
    DummyService dummyService;

    @Test
    void testDummyNameRetrieval() {
        doCallRealMethod().when(dummyMock).getName();
        Assertions.assertEquals("Dummy", dummyService.getDummyName());
    }

    @Test
    void testDummyMockNameRetrieval() {
        when(dummyMock.getName()).thenReturn("Surprise!");
        Assertions.assertEquals("Surprise!", dummyService.getDummyName());
    }
}
