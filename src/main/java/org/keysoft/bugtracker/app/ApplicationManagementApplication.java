package org.keysoft.bugtracker.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.keysoft.bugtracker.*")
public class ApplicationManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationManagementApplication.class, args);
	}
}
