package dev.tpspringboot;

import dev.tpspringboot.document.Formation;
import dev.tpspringboot.repository.FormationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TpSpringBootApplication implements CommandLineRunner{

    @Autowired
    private FormationRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(TpSpringBootApplication.class, args);
	}

	@Override
    public void run(String... args) throws  Exception {
	    repository.deleteAll();

	    repository.save(new Formation("Big Data", 12));
        repository.save(new Formation("Java", 9));
        repository.save(new Formation("Business Intelligence", 11));

        System.out.println("Formations found with findAll():");
        System.out.println("-------------------------------");
        for (Formation formation : repository.findAll()) {
            System.out.println(formation);
        }
    }
}
