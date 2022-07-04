package api.spring.angular;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import api.spring.angular.models.Curso;
import api.spring.angular.repository.CursoRepositotory;

@SpringBootApplication
public class Application {
	@Autowired
	private CursoRepositotory repo;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			Stream.of(new Curso("Spring"), new Curso("Django")).map(repo::save).forEach(System.out::println);
		};
	}

}
