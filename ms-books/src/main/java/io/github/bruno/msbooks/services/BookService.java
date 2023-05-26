package io.github.bruno.msbooks.services;

import io.github.bruno.msbooks.entities.BookEntity;
import io.github.bruno.msbooks.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository repository;

    public List<BookEntity> getAllBooks() {
        return repository.findAll();
    }

    public BookEntity getFromId(Integer id) {
        return repository.findById(id).orElseThrow();
    }
}
