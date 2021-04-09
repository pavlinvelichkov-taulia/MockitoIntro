package com.taulia.example.mocking.MockitoIntro.sample;

import com.taulia.example.mocking.MockitoIntro.services.GlobalDummiesService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.mockito.Mockito.*;

// Take a Rest(Template)

@ExtendWith(MockitoExtension.class)
public class _05_RestTemplate {
    @Mock
    RestTemplate restTemplate;

    @InjectMocks
    GlobalDummiesService globalDummiesService;

    @Test
    void testRestTemplateIsInjected() {
        // Mock the Dummy to return a recognisable non-default name.
        Dummy dummy = mock(Dummy.class);
        when(dummy.getName()).thenReturn("Santa!");

        // Mock the RestTemplate to return the mocked Dummy when the exact request is issued.
        when(restTemplate.getForEntity("http://localhost:8080/dummies/1", Dummy.class))
          .thenReturn(new ResponseEntity(dummy, HttpStatus.OK));

        // Call the service.
        Dummy result = globalDummiesService.getDummy("1");

        // Profit. :)
        Assertions.assertEquals(result.getName(), dummy.getName());
    }
}
