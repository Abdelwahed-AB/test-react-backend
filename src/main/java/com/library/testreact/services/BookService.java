package com.library.testreact.services;

import com.library.testreact.entities.Book;
import com.library.testreact.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService implements IBookService {
    private final BookRepository bookRepository;

    @Override
    public Book getBookById(Long id){
        return bookRepository.findById(id).orElseThrow(()->new RuntimeException("Can't find book with id: " + id));
    }

    @Override
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    @Override
    public void createBook(Book book){
        book.setId(0L);
        bookRepository.save(book);
    }

    @Override
    public void updateBook(Long id, Book book){
        book.setId(id);
        bookRepository.save(book);
    }

    @Override
    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }
}
