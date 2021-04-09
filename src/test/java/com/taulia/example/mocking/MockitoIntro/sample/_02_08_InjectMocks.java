package com.taulia.example.mocking.MockitoIntro.sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

// @InjectMocks

@ExtendWith(MockitoExtension.class)
public class _02_08_InjectMocks {
    @Mock
    Dummy dummyMock;

    @InjectMocks
    Composite composite;

    @Spy
    Composite compositeSpy = new Composite();

    @Test
    void testMockIsInjectedIntoComposite() {
        when(dummyMock.getName()).thenReturn("Mocked name");

        Assertions.assertEquals("Mocked name", composite.getDummyName());
    }

    @Test
    void testMockIsNotInjectedIntoSpy() {
        when(dummyMock.getName()).thenReturn("Mocked name");

        Assertions.assertEquals("Dummy", compositeSpy.getDummyName());
    }

    @Test
    void testMockInSpy() {
        when(dummyMock.getName()).thenReturn("Mocked name");

        Composite newComposite = new Composite(dummyMock);

        Assertions.assertEquals("Mocked name", newComposite.getDummyName());
    }
}
