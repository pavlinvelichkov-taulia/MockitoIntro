package com.taulia.example.mocking.MockitoIntro.sample;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

// Strict vs Lenient

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class _02_06_StrictVsLenient {
    @Mock
    Dummy dummyMock;

    @Test
    void testThrowingAnExceptionWhenMockedMethodIsNotCalled() {
        when(dummyMock.sayHello()).thenReturn("Not today!"); // Will not be called
        when(dummyMock.getName()).thenReturn("Mocked name");

        assertEquals("Mocked name", dummyMock.getName());
    }
}
