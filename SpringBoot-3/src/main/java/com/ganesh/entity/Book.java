package com.ganesh.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Books")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
	
	
	@Id
	private Integer id;
	
	@Column(name = "Book_Name", unique = true)
	private String name;
	
	private Double price;
	
	private Integer qty;
	

}
