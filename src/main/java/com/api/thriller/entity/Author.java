package com.api.thriller.entity;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "authors")
@Entity(name = "Author")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String nationality;

}
