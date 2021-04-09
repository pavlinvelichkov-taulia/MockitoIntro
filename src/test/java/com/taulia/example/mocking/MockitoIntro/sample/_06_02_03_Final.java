package com.taulia.example.mocking.MockitoIntro.sample;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

// Is this your final answer?

@ExtendWith(MockitoExtension.class)
public class _06_02_03_Final {
    @Mock
    FinalDummy dummyMock;

    @Test
    void testMockMethodResponse() {
        // For jUnit4 we would use "mock-maker-inline" toggle in "org.mockito.plugins.MockMaker" resource file.
        when(dummyMock.getName()).thenReturn("Mocked name");

        assertEquals("Mocked name", dummyMock.getName());
    }
}
