package com.library.testreact.services;

import com.library.testreact.entities.Review;

import java.util.List;

public interface IReviewService {
    List<Review> getAllReviews();

    Review getReviewById(Long id);

    void createReview(Review review);

    void updateReview(Long id, Review review);

    void deleteReview(Long id);
}
