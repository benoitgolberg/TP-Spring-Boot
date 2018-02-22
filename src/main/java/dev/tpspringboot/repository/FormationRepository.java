package dev.tpspringboot.repository;

import dev.tpspringboot.document.Formation;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FormationRepository extends MongoRepository<Formation, Integer>{

    public Formation findByName(String name);

    //public List<Formation> getAllFormations();
}
