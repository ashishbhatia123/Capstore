package com.cg.capstore.CapstoreProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@EntityScan("com.cg.capstore")
@ComponentScan("com.cg.capstore")
@SpringBootApplication
public class CapstoreProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapstoreProjectApplication.class, args);
	}

}
