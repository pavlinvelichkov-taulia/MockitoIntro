package com.taulia.example.mocking.MockitoIntro.sample;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

// Mocking VS Spying (No, THIS is what you should do! / What'cha doin' there?)

@ExtendWith(MockitoExtension.class)
public class _02_04_MockVsSpy {
    @Mock
    Dummy dummyMock;

    @Spy
    Dummy dummySpy = new Dummy();

    @Test
    void testMockMethodResponse() {
        when(dummyMock.getName()).thenReturn("Mocked name");

        assertEquals("Mocked name", dummyMock.getName());
    }

    @Test
    void testNonMockMethodResponse() {
        assertNull(dummyMock.getName());
    }

    @Test
    void testSpyMethodResponse() {
        assertEquals("Dummy", dummySpy.getName());
    }

    @Test
    void testSpyWithMockingMethodResponse() {
        when(dummySpy.getName()).thenReturn("Mocked name");

        assertEquals("Mocked name", dummySpy.getName());
    }
}
