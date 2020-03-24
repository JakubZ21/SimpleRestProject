package pl.jakubz.rest.library.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.jakubz.rest.library.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
