package com.taulia.example.mocking.MockitoIntro.sample;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

// @Captor (optional, if we are quick up to here)

@ExtendWith(MockitoExtension.class)
public class _02_09_Captor {
    @Spy
    Dummy dummySpy = new Dummy();

    @Test
    void testMethodInvocationWithConcreteArgument() {
        dummySpy.setName("New name");

        ArgumentCaptor<String> arg = ArgumentCaptor.forClass(String.class);
        verify(dummySpy).setName(arg.capture());

        assertEquals("New name", arg.getValue());
    }
}
