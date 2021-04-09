package com.taulia.example.mocking.MockitoIntro.sample;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;

import static org.mockito.ArgumentMatchers.anyString;

// Under construction

@ExtendWith(MockitoExtension.class)
public class _06_02_02_UnderConstruction {
    @Test
    void testMockConstructor() {
        // Available as of v3.5.0 (+ implements AutoClosesable!)
//        MockedConstruction<Dummy> mocked = Mockito.mockConstruction(Dummy.class,
//                (mock, context) -> {
//                    // Add your stubs here.
//                    when(dummyMock.getName()).thenReturn("Mocked dummy");
//                });
//        ...
//        assertEquals(1, mocked.constructed().size());
    }
}
