package net.atos.apirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.SpringVersion;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication
public class ApirestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApirestApplication.class, args);
	}
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ApirestApplication.class);
	}
	
}
