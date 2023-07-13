package com.bagusmahendrawicaksono.sandbox.books.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bagusmahendrawicaksono.sandbox.books.model.Books;

public interface BookRepository extends MongoRepository<Books, String>{
    
}
