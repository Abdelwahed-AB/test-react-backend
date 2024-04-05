package com.library.testreact.repositories;

import com.library.testreact.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> getReviewsByBook_Id(Long id);
}
