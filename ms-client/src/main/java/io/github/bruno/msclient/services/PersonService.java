package io.github.bruno.msclient.services;

import io.github.bruno.msclient.entities.PersonEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Service
public class PersonService {
    private final Logger logger = Logger.getLogger(PersonService.class.getName());

    PersonEntity bruno = new PersonEntity(1, "Bruno", "Santos", "rua boa vista", "983191919");
    PersonEntity lucas = new PersonEntity(2, "Lucas", "Pereira", "rua santa rosa", "8982323232");
    PersonEntity felipe = new PersonEntity(3, "Felipe", "Kleber", "rua Dom Pedro", "232323156731");
    List<PersonEntity> persons = new ArrayList<>();

    public PersonService() {
        persons.add(bruno);
        persons.add(lucas);
        persons.add(felipe);
    }

    public List<PersonEntity> getById(Integer id) {
        logger.info("Finding one person");
        return persons.stream().filter(t -> t.getId() == id).toList();
    }

    public void saveToUser(PersonEntity person) {
        System.out.println(persons);
        persons.add(new PersonEntity(person.getId(), person.getFirstname(), person.getLastname(), person.getAddress(), person.getGender()));
    }
}
