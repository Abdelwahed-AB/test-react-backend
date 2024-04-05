package com.library.testreact.services;

import com.library.testreact.entities.Book;

import java.util.List;

public interface IBookService {
    Book getBookById(Long id);

    List<Book> getAllBooks();

    void createBook(Book book);

    void updateBook(Long id, Book book);

    void deleteBook(Long id);
}
