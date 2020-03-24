package pl.jakubz.rest.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import pl.jakubz.rest.library.dao.BookRepository;
import pl.jakubz.rest.library.entity.Book;

import java.util.List;
import java.util.Optional;

public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;


    /*@Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findById(int id) {
        Optional<Book> byId = bookRepository.findById(id);
        return byId;
    }

    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void delete(Book book) {
        bookRepository.delete(book);
    }*/
}
