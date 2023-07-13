package com.bagusmahendrawicaksono.sandbox.books.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "books")
public class Books {
    @Id
    private String id;
    @Indexed(unique=true)
    private String isbn;
    private String title;
    private String subtitle;
    private String author;
    private String published;
    private String publisher;
    private int pages;
    private String description;
    private String website;
    private String imageurl;
    private BigDecimal price;
}
