package com.example.demo.repository;

import com.example.demo.model.Book;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {

    public String getMessage(){
        return "Hello, I'm the get method";
    }

    public String postBookName(Book book)
    {
        return "Posted " + book.getName();
    }
}