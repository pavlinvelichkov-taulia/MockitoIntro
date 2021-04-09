package com.taulia.example.mocking.MockitoIntro.services;

import com.taulia.example.mocking.MockitoIntro.sample.Dummy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GlobalDummiesService {
    @Autowired
    private RestTemplate restTemplate;

    public Dummy getDummy(String id) {
        ResponseEntity resp =
                restTemplate.getForEntity("http://localhost:8080/dummies/" + id, Dummy.class);

        return resp.getStatusCode() == HttpStatus.OK ? (Dummy) resp.getBody() : null;
    }
}
