package com.taulia.example.mocking.MockitoIntro.sample;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Mockito.*;

// Trust, but verify (Do these match?)

@ExtendWith(MockitoExtension.class)
public class _02_05_Verify {
    @Spy
    Dummy dummySpy = new Dummy();

    @Test
    void testMethodInvocation() {
        dummySpy.getName();

        verify(dummySpy).getName();
    }

    @Test
    void testNoMethodInvocation() {
        verify(dummySpy, times(0)).getName();
    }

    @Test
    void testMethodInvocationWithConcreteArgument() {
        dummySpy.setName("New name");

        verify(dummySpy).setName("New name");
    }

    // Argument matchers

    @Test
    void testMethodInvocationWithArgument() {
        for (int i = 0; i < 50; i++) {
            dummySpy.setName("New name");
        }

        verify(dummySpy, times(50)).setName(anyString());
    }

    @Test
    void testMethodInvocationWithTwoArguments() {
        dummySpy.areTheSame("Unique", "Unique");

//        verify(dummySpy).areTheSame("Unique", anyString());
        verify(dummySpy).areTheSame(eq("Unique"), anyString());
        verify(dummySpy).areTheSame(or(eq("Duplicate"), contains("q")), or(eq("Copy"), contains("u")));
    }
}
