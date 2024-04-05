package com.library.testreact.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Book {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    @Column(length = 2000)
    private String description;
    private Genre genre;
    private String thumbnailImage;
}
