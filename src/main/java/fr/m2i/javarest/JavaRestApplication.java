package fr.m2i.javarest;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class JavaRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaRestApplication.class, args);
	}

}
