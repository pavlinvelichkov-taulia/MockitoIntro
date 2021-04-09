package com.taulia.example.mocking.MockitoIntro.sample;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import sun.plugin.dom.exception.InvalidStateException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

// Calling into the void

@ExtendWith(MockitoExtension.class)
public class _02_07_Void {
    @Spy
    Dummy dummySpy;

    @Test
    void testVoidMethodMocking() {
        doNothing().when(dummySpy).setName(anyString());

        dummySpy.setName("That's right!");

        verify(dummySpy).setName("That's right!");
        assertEquals("Dummy", dummySpy.getName());
    }

    @Test
    void testThrowingException() {
        Exception ex = new InvalidStateException("This is wrong!");
        doThrow(ex).when(dummySpy).setName(anyString());

        assertThrows(InvalidStateException.class, () -> {
            dummySpy.setName("That's right!");
        });
    }
}
