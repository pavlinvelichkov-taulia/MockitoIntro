package com.taulia.example.mocking.MockitoIntro.sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

// Testing an abstraction

@ExtendWith(MockitoExtension.class)
public class _03_Abstractions {
    @Mock
    AbstractDummy dummyAbstract;

    @Test
    void testAbstractWithoutConcreteImplementation() {
        AbstractDummy dummyLocalAbstract = Mockito.mock(
                AbstractDummy.class,
                Mockito.CALLS_REAL_METHODS);

        Assertions.assertEquals("I am your father!", dummyLocalAbstract.getParentToSaySomething());
    }

    @Test
    void testMockAbstractMethod() {
        Mockito.doCallRealMethod().when(dummyAbstract).getNameFromParent();
        Mockito.when(dummyAbstract.getName()).thenReturn("Abstract");

        Assertions.assertEquals("Abstract", dummyAbstract.getNameFromParent());
    }
}
