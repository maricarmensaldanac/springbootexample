package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public String sayHello()
    {
        return bookRepository.getMessage();
    }
    public String postBookName(Book book) {return bookRepository.postBookName(book);};

    public String updateBook(Book book){ return "Updated " + book.getName(); }

    public String deleteBook(Book book){ return "Deleted " + book.getName(); }
}