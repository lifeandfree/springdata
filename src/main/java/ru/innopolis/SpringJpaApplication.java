package ru.innopolis;

import static ru.innopolis.App.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.innopolis.service.UserOperationService;

@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext application = SpringApplication.run(SpringJpaApplication.class, args);

		final UserOperationService userOperationService = application.getBean(UserOperationService.class);
		start(userOperationService);
	}

}
