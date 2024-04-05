package com.library.testreact.controllers;

import com.library.testreact.entities.Review;
import com.library.testreact.services.IReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("/reviews")
@RequiredArgsConstructor
public class ReviewController {
    private final IReviewService reviewService;

    @GetMapping
    public List<Review> getAllReviews(@RequestParam(required = false) Long bookId){
        if(bookId == null){
            return reviewService.getAllReviews();
        }
        return reviewService.getReviewsByBookId(bookId);
    }

    @GetMapping("/{id}")
    public Review getReviewById(@PathVariable Long id){
        return reviewService.getReviewById(id);
    }

    @PostMapping
    public void createReview(Review review){
        reviewService.createReview(review);
    }

    @PutMapping("/{id}")
    public void updateReview(@PathVariable Long id, @RequestBody Review review){
        reviewService.updateReview(id, review);
    }

    @DeleteMapping("/{id}")
    public void deleteReview(@PathVariable Long id){
        reviewService.deleteReview(id);
    }
}
