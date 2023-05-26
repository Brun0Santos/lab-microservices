package io.github.bruno.msclient.controllers;

import io.github.bruno.msclient.dto.PersonDto;
import io.github.bruno.msclient.entities.PersonEntity;
import io.github.bruno.msclient.services.PersonService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/person")
@Tag(name = "People", description = "Endpoint for actions on route")
public class PersonController {

    @Autowired
    private PersonService personService;

    @Autowired
    private ModelMapper mapper;

    @GetMapping("/status")
    @Operation(summary = "Check system status")
    public String sendStatus() {
        return "Server is running.....";
    }

    @GetMapping
    @Operation(summary = "Get all peoples", description = "Get to all peoples from database",
            responses = {
                    @ApiResponse(description = "Success", responseCode = "200", content = @Content(
                            mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = PersonDto.class))
                    )),
                    @ApiResponse(description = "Bad Request", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Unauthorized", responseCode = "401", content = @Content),
                    @ApiResponse(description = "Not Found", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Internal Server Error", responseCode = "500", content = @Content),

            }
    )
    public ResponseEntity<List<PersonEntity>> returnAllUsers() {
        List<PersonEntity> users = personService.getUsers();
        return ResponseEntity.ok().body(users);
    }

    @GetMapping(value = "/{id}")
    @Operation(summary = "Get user by id", description = "Search for specific user", responses = {
            @ApiResponse(description = "Success", responseCode = "200", content = {
                    @Content(mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = PersonDto.class)))
            }),
            @ApiResponse(description = "No Content", responseCode = "204", content = @Content),
            @ApiResponse(description = "Bad Request", responseCode = "404", content = @Content),
            @ApiResponse(description = "Unauthorized", responseCode = "401", content = @Content),
            @ApiResponse(description = "Not Found", responseCode = "404", content = @Content),
            @ApiResponse(description = "Internal Server Error", responseCode = "500", content = @Content),
    })
    public Optional<PersonEntity> getPerson(@PathVariable Integer id) {
        return personService.getById(id);
    }

    @PostMapping
    @Operation(summary = "Save user", description = "Save user to database")
    public ResponseEntity<PersonDto> saveToUserInDatabase(@RequestBody PersonEntity person) {
        personService.saveToUser(person);
        return ResponseEntity.status(HttpStatus.CREATED).body(mapper.map(person, PersonDto.class));
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete specific user", description = "Delete for specific user")
    public ResponseEntity<String> deleteToUser(@PathVariable("id") Integer id) {
        personService.deleteToUser(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
