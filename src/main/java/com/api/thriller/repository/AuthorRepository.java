package com.api.thriller.repository;

import com.api.thriller.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Book, Long> {
}
