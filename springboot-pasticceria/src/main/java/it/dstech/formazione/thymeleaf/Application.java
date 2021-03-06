package it.dstech.formazione.thymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages={"it.dstech.formazione.thymeleaf"})
@EnableJpaRepositories(basePackages="it.dstech.formazione.thymeleaf.repositories")
@EnableTransactionManagement
@EntityScan(basePackages="it.dstech.formazione.thymeleaf.model")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
