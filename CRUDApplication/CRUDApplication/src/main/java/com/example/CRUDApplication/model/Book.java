package com.example.CRUDApplication.model;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.*;

@Entity
@Table(name = "Books")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String author;
}
