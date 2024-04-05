package com.library.testreact.services;

import com.library.testreact.entities.Review;
import com.library.testreact.repositories.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewService implements IReviewService {
    private final ReviewRepository reviewRepository;

    @Override
    public List<Review> getAllReviews(){
        return reviewRepository.findAll();
    }

    @Override
    public List<Review> getReviewsByBookId(Long bookId){
        return reviewRepository.getReviewsByBook_Id(bookId);
    }

    @Override
    public Review getReviewById(Long id){
        return reviewRepository.findById(id).orElseThrow(()->new RuntimeException("Can't find review with id: "+id));
    }

    @Override
    public void createReview(Review review){
        review.setId(0L);
        reviewRepository.save(review);
    }

    @Override
    public void updateReview(Long id, Review review){
        review.setId(id);
        reviewRepository.save(review);
    }

    @Override
    public void deleteReview(Long id){
        reviewRepository.deleteById(id);
    }
}
