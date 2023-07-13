package com.bagusmahendrawicaksono.sandbox.books.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bagusmahendrawicaksono.sandbox.books.model.Books;
import com.bagusmahendrawicaksono.sandbox.books.repository.BookRepository;

@RestController
public class BookController {
    private final BookRepository bookRepo;

    public BookController(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    @PostMapping("/books")
    public String saveBook(@RequestBody List<Books> books){
        bookRepo.saveAll(books);
       
        return "Added Successfully";
    }
 
    @GetMapping("/books")
    public List<Books> getBooks() {
       
        return bookRepo.findAll();
    }
 
    @DeleteMapping("/books/{id}")
    public String deleteBook(@PathVariable String id){
        bookRepo.deleteById(id);
       
        return "Deleted Successfully";
    }
}
