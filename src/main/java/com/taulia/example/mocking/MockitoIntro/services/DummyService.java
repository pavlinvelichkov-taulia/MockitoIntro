package com.taulia.example.mocking.MockitoIntro.services;

import com.taulia.example.mocking.MockitoIntro.sample.Dummy;
import org.springframework.stereotype.Service;

@Service
public class DummyService {
    private Dummy dummy;

    public String getDummyName() {
        return this.dummy.getName();
    }

    private DummyService(Dummy dummy) {
        this.dummy = dummy;
//        this.dummy = null;
    }
}
