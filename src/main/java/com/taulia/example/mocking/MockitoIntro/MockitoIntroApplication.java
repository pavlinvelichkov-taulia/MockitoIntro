package com.taulia.example.mocking.MockitoIntro;

import com.taulia.example.mocking.MockitoIntro.sample.Dummy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MockitoIntroApplication {

	public static void main(String[] args) {
		SpringApplication.run(MockitoIntroApplication.class, args);
	}

	@Bean
	public Dummy getDefaultDummy() {
		return new Dummy();
	}

	@Bean
	public RestTemplate getDefaultRestTemplate() {
		return new RestTemplate();
	}
}
