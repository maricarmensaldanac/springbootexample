package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("Args" + args);
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	private BookService bookService;

	@Autowired ExcersicesJ8 excersicesJ8;

	@GetMapping
	public String get()
	{
		//excersicesJ8.isAnAnagram("Ana", "Naa");
		//excersicesJ8.isAPrimeNumber(55);
		return bookService.sayHello();
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

}