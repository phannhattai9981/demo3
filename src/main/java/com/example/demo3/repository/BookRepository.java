package com.example.demo3.repository;

import com.example.demo3.entity.BookEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

;import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<BookEntity, Integer> {
    List<BookEntity> findAll();

    List<BookEntity> findByNameContainingAndAuthorContaining(String name, String author);
}
