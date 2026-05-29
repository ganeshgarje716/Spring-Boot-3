package com.ganesh;

import java.util.List;

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
		
		
		
		Book b2=new Book(4, "CSS", 2700.00, 118);
		Book b3=new Book(5, "JS", 1500.00, 23);
		Book b1=new Book(6, "React", 1200.00, 8);
		
		bookRepository.saveAll(List.of(b1,b2,b3));
	}

}
