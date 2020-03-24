package pl.jakubz.rest.library.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.jakubz.rest.library.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
