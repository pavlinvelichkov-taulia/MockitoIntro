package com.taulia.example.mocking.MockitoIntro.sample;

import org.junit.Rule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.junit.jupiter.MockitoExtension;

// Basic functionality (embrace the Basic)
// init(where it all starts)

//@RunWith(MockitoJUnitRunner.class)
@ExtendWith(MockitoExtension.class)
class _02_01_Initialisation {
//    @Rule
//    public MockitoRule rule = MockitoJUnit.rule();

    @Mock
    Dummy dummyMock;

    @Test
    @DisplayName("Simple mock is initialised.")
    void testMockIsInitialised() {
        Assertions.assertNotNull(dummyMock);
    }
}
