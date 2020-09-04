package com.memija.openshift.training;

import com.memija.openshift.training.models.Quote;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class TrainingApplication {

	private static final String apiEndpoint = "https://gturnquist-quoters.cfapps.io/api/random";

	private static final Logger log = LoggerFactory.getLogger(TrainingApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TrainingApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Quote quote = restTemplate.getForObject(apiEndpoint, Quote.class);
			log.info(quote.toString());
		};
	}

}
