package com.ganesh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ganesh.Repository.BookRepository;
import com.ganesh.entity.Book;

@SpringBootApplication
public class SpringBoot3Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot3Application.class, args);
	}
	
	
	@Autowired
	BookRepository bookRepository;

	@Override
	public void run(String... args) throws Exception {
		
		
		Book b1=new Book(1, "Java", 2300.00, 12);
		bookRepository.save(b1);
	}

}
