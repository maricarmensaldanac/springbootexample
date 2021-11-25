package com.example.demo.service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

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

    //Examples of checked exceptions
    public static void main(String[] args)
    {
        try {
            FileReader file = new FileReader("somefile.txt");
        }catch(Exception e)
        {
            System.out.println("I'm a catched exception " + e);
        }
    }

    private static void checkedExceptionWithThrows() throws FileNotFoundException {
        File file = new File("not_existing_file.txt");
        FileInputStream stream = new FileInputStream(file);
    }

    Object obj = new Object();
}