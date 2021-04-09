package com.taulia.example.mocking.MockitoIntro.sample;

import com.taulia.example.mocking.MockitoIntro.services.DummyService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

// Let’s Spring into action
// Run!

@ExtendWith(MockitoExtension.class)
public class _04_01_SpringUnitTest {
    @Mock
    Dummy dummyMock;

    @InjectMocks
    DummyService dummyService;

    @Test
    void testMockIsInjectedInService() {
        when(dummyMock.getName()).thenReturn("Mock in a service");

        Assertions.assertEquals("Mock in a service", dummyService.getDummyName());
    }
}
