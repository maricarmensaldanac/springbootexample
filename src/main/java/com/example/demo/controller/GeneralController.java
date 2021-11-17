package com.example.demo.controller;

import com.example.demo.exception.ApiRequestException;
import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import com.example.demo.ExcersicesJ8;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/example")
public class GeneralController {

    @Autowired
    private BookService bookService;

    @Autowired
    private ExcersicesJ8 excersicesJ8;

    @GetMapping
    @RequestMapping("/getMethod")
    public String get()
    {
        throw new ApiRequestException("Prueba de excepción");
        //return bookService.sayHello();
    }

    @PostMapping
    public String insert(@RequestBody Book book)
    {
        return bookService.postBookName(book);
    }

    @PutMapping
    public String update(@RequestBody Book book)
    {
        return bookService.updateBook(book);
    }

    @DeleteMapping
    public String delete(@RequestBody Book book)
    {
        return bookService.updateBook(book);
    }

    @GetMapping
    @RequestMapping("/J8")
    public String exercises()
    {
        excersicesJ8.isAnAnagram("Ana", "Naa");
        excersicesJ8.isAPrimeNumber(5);

        return "Done";
    }

    @GetMapping
    @RequestMapping("/prime/{num}")
    public String exercises(@PathVariable Integer num)
    {
        return excersicesJ8.isAPrimeNumber(num);
    }

    @GetMapping
    @RequestMapping("/anagram/{w1}/{w2}")
    public String anagram(@PathVariable String w1, @PathVariable String w2) {
        return excersicesJ8.isAnAnagram(w1, w2);
    }

}