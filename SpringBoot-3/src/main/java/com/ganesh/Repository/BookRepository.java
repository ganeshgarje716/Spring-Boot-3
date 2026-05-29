package com.ganesh.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ganesh.entity.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer>{

}
