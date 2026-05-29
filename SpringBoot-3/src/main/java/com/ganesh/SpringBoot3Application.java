package com.ganesh;

import java.util.List;
import java.util.Optional;

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
		
		
		
//		Book b2=new Book(7, "Angular", 2700.00, 18);
//		Book b3=new Book(8, "Hibernate", 1500.00, 3);
//		Book b1=new Book(9, "JDBC", 1200.00, 8);
//		
//		bookRepository.saveAll(List.of(b1,b2,b3));
		
		
//		System.out.println(bookRepository.count());
		
		
		Optional<Book> b = bookRepository.findById(1);
		
		if (b.isPresent()) {
			
			System.err.println( b.get());
		}
		else {
			
			System.err.println("Book not available");
		}
	} 

}
