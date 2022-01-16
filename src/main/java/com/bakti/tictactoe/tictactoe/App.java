package com.bakti.tictactoe.tictactoe;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.SpringServletContainerInitializer;
import org.springframework.web.client.RestTemplate;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableSwagger2
public class App extends SpringServletContainerInitializer {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Bean
	public Docket api() {
		Contact contact = new Contact("bakti", "", "");
		ApiInfo apiInfo = new ApiInfo("TicTacToe bakti", "Technical Test for FWD Singapore recruitment", "1.0", "", contact,
				"license", "", new ArrayList<>());

		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo);
	}

	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(App.class);
	}

	@Bean
	public RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate;
	}

	public void run(String... args) throws Exception {
		logger.info("App is up.");
	}
}
