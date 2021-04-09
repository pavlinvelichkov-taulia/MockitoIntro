package com.taulia.example.mocking.MockitoIntro.sample;

public abstract class AbstractDummy {
    public abstract String getName();

    public String getParentToSaySomething() {
        return "I am your father!";
    }

    public String getNameFromParent() {
        return getName();
    }
}
