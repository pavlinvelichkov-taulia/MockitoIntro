package com.taulia.example.mocking.MockitoIntro.sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

// @Mock

@ExtendWith(MockitoExtension.class)
public class _02_02_SimpleMock {
    @Mock
    Dummy dummyMock;

    @Test
    @DisplayName("Simple mock is initialised using annotation.")
    void testMockIsInitialised() {
        Assertions.assertNotNull(dummyMock);
    }

    @Test
    @DisplayName("Simple mock is created using direct call.")
    void testMockIsCreated() {
        Dummy newDummyMock = Mockito.mock(Dummy.class);
        Assertions.assertNotNull(newDummyMock);
    }
}
