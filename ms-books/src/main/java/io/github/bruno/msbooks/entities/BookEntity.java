package io.github.bruno.msbooks.entities;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "tb_book")
public class BookEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String author;
    private LocalDate launch_date;
    private Double price;
    private String title;

    public BookEntity() {
    }

    public BookEntity(String author, LocalDate launch_date, Double price, String title) {
        this.author = author;
        this.launch_date = launch_date;
        this.price = price;
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getLaunch_date() {
        return launch_date;
    }

    public Double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }
}
