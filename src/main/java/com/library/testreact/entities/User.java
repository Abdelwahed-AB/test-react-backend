package com.library.testreact.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity @Table(name = "user_table")
@Data
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String profilePicture;

    @OneToMany
    private List<Book> readBooks = new ArrayList<>();
    @OneToMany
    private List<Book> bookWishList = new ArrayList<>();
}
