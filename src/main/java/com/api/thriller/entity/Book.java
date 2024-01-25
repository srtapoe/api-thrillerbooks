package com.api.thriller.entity;

import com.api.thriller.dto.BookDate;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "books")
@Entity(name = "Book")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private int yearPublication;
    private int pages;
    private String language;

    @Enumerated(EnumType.STRING)
    private Types genre;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;


    public Book(BookDate bookDate){
        this.title = bookDate.title();
        this.yearPublication = bookDate.yearPublication();
        this.pages = bookDate.pages();
        this.language = bookDate.language();
        this.genre = bookDate.genre();
    }

}
