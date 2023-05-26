package io.github.bruno.msbooks.repository;

import io.github.bruno.msbooks.entities.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity, Integer> {
}
