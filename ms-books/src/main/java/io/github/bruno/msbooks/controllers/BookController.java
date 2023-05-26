package io.github.bruno.msbooks.controllers;

import io.github.bruno.msbooks.entities.BookEntity;
import io.github.bruno.msbooks.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService service;

    @GetMapping
    public List<BookEntity> returnAllBook() {

    }
}
