package com.taulia.example.mocking.MockitoIntro.sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

// @Spy

@ExtendWith(MockitoExtension.class)
public class _02_03_SimpleSpy {
    @Spy
    Dummy dummySpy;

    @Spy
    Dummy dummySpyWithValue = new Dummy();

    @Test
    @DisplayName("Simple spy is NOT initialised using annotation.")
    void testSpyIsNotInitialised() {
        Assertions.assertNull(dummySpy);
    }

    @Test
    @DisplayName("Simple spy is initialised using annotation and real object.")
    void testSpyIsInitialised() {
        Assertions.assertNotNull(dummySpyWithValue);
    }

    @Test
    @DisplayName("Simple spy is created using direct call.")
    void testSpyIsCreated() {
        Dummy newDummySpy = Mockito.spy(Dummy.class);
        Assertions.assertNotNull(newDummySpy);
    }
}
