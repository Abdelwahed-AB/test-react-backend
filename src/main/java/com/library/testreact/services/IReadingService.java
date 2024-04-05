package com.library.testreact.services;

import com.library.testreact.entities.Book;

import java.util.List;

public interface IReadingService {
    List<Book> getReadBooks(Long userId);

    void readBook(Long userId, Long bookId);

    void unreadBook(Long userId, Long bookId);
}
