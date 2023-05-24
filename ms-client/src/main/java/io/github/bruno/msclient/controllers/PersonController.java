package io.github.bruno.msclient.controllers;

import io.github.bruno.msclient.entities.PersonEntity;
import io.github.bruno.msclient.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping
    public String sendStatus() {
        return "Server is running.....";
    }

    @GetMapping(value = "/{id}")
    public List<PersonEntity> getPerson(@PathVariable Integer id) {
        return personService.getById(id);
    }

    @PostMapping
    public ResponseEntity<String> saveToUserInDatabase(@RequestBody PersonEntity person) {
        personService.saveToUser(person);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
