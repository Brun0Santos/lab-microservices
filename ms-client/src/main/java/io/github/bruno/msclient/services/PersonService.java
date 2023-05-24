package io.github.bruno.msclient.services;

import io.github.bruno.msclient.entities.PersonEntity;
import io.github.bruno.msclient.repositories.PersonRepository;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;
    private final Logger logger = Logger.getLogger(PersonService.class.getName());

    public List<PersonEntity> getUsers() {
        return personRepository.findAll();
    }

    public Optional<PersonEntity> getById(Integer id) {
        return personRepository.findById(id);
    }

    @Transactional
    public void saveToUser(PersonEntity person) {
        personRepository.save(person);
    }

    @Transactional
    public void deleteToUser(Integer id) {
        Optional<PersonEntity> user = personRepository.findById(id);
        if (user.isEmpty()) {
            throw new NotFoundException("User not found");
        }
        personRepository.deleteById(id);
    }
}
