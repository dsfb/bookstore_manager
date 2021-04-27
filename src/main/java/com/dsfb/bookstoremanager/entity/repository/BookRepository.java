package com.dsfb.bookstoremanager.entity.repository;

import com.dsfb.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
