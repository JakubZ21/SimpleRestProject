package pl.jakubz.rest.library.entity;

import lombok.Data;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.time.Year;
@Entity
@Table(name = "books")
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int bookId;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "year_release")
    private int yearRelease;

    @Column(name = "bookshelf_number")
    private String bookshelfNumber;

    @Column(name = "bookshelf_row")
    private String bookshelfRow;


    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
}
