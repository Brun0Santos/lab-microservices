package io.github.bruno.msbooks.controllers;

import io.github.bruno.msbooks.entities.BookEntity;
import io.github.bruno.msbooks.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/books")
public class BookController {
    @Autowired
    private BookService service;

    @GetMapping("/status")
    public String statusSever(){
        return "Server is running....";
    }


    @GetMapping
    public ResponseEntity<List<BookEntity>> returnAllBook() {
        List<BookEntity> allBooks = service.getAllBooks();
        return ResponseEntity.ok(allBooks);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookEntity> returnSpecificUser(@RequestBody Integer id) {
        BookEntity specificUser = service.getFromId(id);
        return ResponseEntity.ok(specificUser);
    }
}

