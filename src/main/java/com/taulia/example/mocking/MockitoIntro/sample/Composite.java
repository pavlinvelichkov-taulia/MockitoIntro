package com.taulia.example.mocking.MockitoIntro.sample;

public class Composite {
    private Dummy dummy;

    public String getDummyName() {
        return this.dummy.getName();
    }

    public Composite() {
        this(null);
    }

    public Composite(Dummy dummy) {
        if (null == dummy) {
            dummy = new Dummy();
        }
        this.dummy = dummy;
    }
}
