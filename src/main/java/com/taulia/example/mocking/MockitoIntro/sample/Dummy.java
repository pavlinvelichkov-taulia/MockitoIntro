package com.taulia.example.mocking.MockitoIntro.sample;

public class Dummy {
    private String name = "Dummy";

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean areTheSame(String str1, String str2) {
        return str1.equals(str2);
    }

    public String sayHello() {
        return "Hello!";
    }

    private String sayGoodbye() {
        return "Goodbye!";
    }
}
