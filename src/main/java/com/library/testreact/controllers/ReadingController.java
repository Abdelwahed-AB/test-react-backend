package com.library.testreact.controllers;

import com.library.testreact.dto.ReadRequest;
import com.library.testreact.entities.Book;
import com.library.testreact.services.IReadingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("/read") @CrossOrigin("*")
@RequiredArgsConstructor
public class ReadingController {
    private final IReadingService readingService;

    @GetMapping
    public List<Book> getReadBooks(@RequestParam(required = true) Long userId){
        return readingService.getReadBooks(userId);
    }

    @PostMapping
    public void readBook(@RequestBody ReadRequest readRequest){
        readingService.readBook(readRequest.userId(), readRequest.bookId());
    }

    @DeleteMapping
    public void unreadBook(@RequestBody ReadRequest readRequest){
        readingService.unreadBook(readRequest.userId(), readRequest.bookId());
    }
}
