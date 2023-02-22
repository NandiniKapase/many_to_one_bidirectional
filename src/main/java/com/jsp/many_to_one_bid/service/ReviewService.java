package com.jsp.many_to_one_bid.service;

import com.jsp.many_to_one_bid.dao.ReviewDao;
import com.jsp.many_to_one_bid.dto.Review;

public class ReviewService {
	ReviewDao reviewDao=new ReviewDao();
	public Review createReview(Review review) {
		return reviewDao.createReview(review);
		
	}
	public Review deleteReview(Review review) {
		return reviewDao.deleteReview(review);
		
	}
	public Review updateReview(Review review) {
		return reviewDao.updateReview(review);
	}
}
