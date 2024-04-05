package com.library.testreact.services;

import com.library.testreact.entities.Book;
import com.library.testreact.entities.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReadingService implements IReadingService {
    private final IUserService userService;
    private final IBookService bookService;

    @Override
    public List<Book> getReadBooks(Long userId){
        return userService.getUserById(userId).getReadBooks();
    }

    @Override
    public void readBook(Long userId, Long bookId){
        Book book = bookService.getBookById(bookId);
        User user = userService.getUserById(userId);

        user.getReadBooks().add(book);

        userService.updateUser(userId, user);
    }

    @Override
    public void unreadBook(Long userId, Long bookId){
        Book book = bookService.getBookById(bookId);
        User user = userService.getUserById(userId);

        user.getReadBooks().remove(book);

        userService.updateUser(userId, user);
    }
}
