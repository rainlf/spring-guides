package com.rainlf;

import com.rainlf.hello.Person;
import com.rainlf.hello.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@EnableNeo4jRepositories
public class Application {

	private final static Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner demo(PersonRepository personRepository) {
		return args -> {
			personRepository.deleteAll();

			Person grep = new Person("Grep");
			Person roy = new Person("Roy");
			Person craig = new Person("Craig");

			List<Person> team = Arrays.asList(grep, roy, craig);

			team.stream().forEach(person -> log.info("\t" + person.getName()));

			personRepository.save(grep);
			personRepository.save(roy);
			personRepository.save(craig);

			grep = personRepository.findByName(grep.getName());
			grep.worksWith(roy);
			grep.worksWith(craig);
			personRepository.save(grep);

			roy = personRepository.findByName(roy.getName());
			roy.worksWith(craig);
			// We already know that roy works with grep
			personRepository.save(roy);

			log.info("Lookup each person by name...");
			team.stream().forEach(person -> {
				log.info("\t" + personRepository.findByName(person.getName()).toString());
			});
		};
	}
}
