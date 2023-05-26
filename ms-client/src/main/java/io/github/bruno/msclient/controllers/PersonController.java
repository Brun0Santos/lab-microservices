package io.github.bruno.msclient.controllers;

import io.github.bruno.msclient.dto.PersonDto;
import io.github.bruno.msclient.entities.PersonEntity;
import io.github.bruno.msclient.services.PersonService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @Autowired
    private ModelMapper mapper;

    @GetMapping("/status")
    public String sendStatus() {
        return "Server is running.....";
    }

    @GetMapping
    public ResponseEntity<List<PersonEntity>> returnAllUsers() {
        List<PersonEntity> users = personService.getUsers();
        return ResponseEntity.ok().body(users);
    }

    @GetMapping(value = "/{id}")
    public Optional<PersonEntity> getPerson(@PathVariable Integer id) {
        return personService.getById(id);
    }

    @PostMapping
    public ResponseEntity<PersonDto> saveToUserInDatabase(@RequestBody PersonEntity person) {
        personService.saveToUser(person);
        return ResponseEntity.status(HttpStatus.CREATED).body(mapper.map(person, PersonDto.class));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteToUser(@PathVariable("id") Integer id) {
        personService.deleteToUser(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
