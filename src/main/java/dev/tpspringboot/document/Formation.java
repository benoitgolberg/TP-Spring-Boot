package dev.tpspringboot.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Formation {

    @Id
    public  String id;

    public String name;
    public Integer nbMaxTrainees;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNbMaxTrainees() {
        return nbMaxTrainees;
    }

    public void setNbMaxTrainees(Integer nbMaxTrainees) {
        this.nbMaxTrainees = nbMaxTrainees;
    }

    public Formation() {}

    public Formation(String name, Integer nbMaxTrainees) {
        this.name = name;
        this.nbMaxTrainees = nbMaxTrainees;
    }

    @Override
    public String toString() {
        return String.format("Formation : [id = %s, name = '%s', nbMaxTrainees = %s", id, name, nbMaxTrainees);
    }
}
