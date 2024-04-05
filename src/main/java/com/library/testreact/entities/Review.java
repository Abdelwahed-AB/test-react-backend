package com.library.testreact.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Review {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private User user;
    @OneToOne
    private Book book;

    private Integer score;
    private String description;
}
