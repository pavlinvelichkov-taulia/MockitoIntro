package com.taulia.example.mocking.MockitoIntro.sample;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

// How it works behind the scene
// …, so it cannot…
// This is PRIVATE!

@ExtendWith(MockitoExtension.class)
public class _06_02_01_Private {
    @Mock
    Dummy dummyMock;

    @Test
    void testMockPrivateMethodResponse() {
        //when(dummyMock, "sayGoodbye").thenReturn("Mocked name");

        // Implicitly call the private method.
        // ...

        // Verify the method was called.
        //verifyPrivate(dummyMock).invoke("sayGoodbye");
    }
}
