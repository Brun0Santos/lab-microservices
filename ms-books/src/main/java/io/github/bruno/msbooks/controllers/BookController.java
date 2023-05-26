package io.github.bruno.msbooks.controllers;

import io.github.bruno.msbooks.entities.BookEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    public List<BookEntity> getAllBooks() {

    }
}
