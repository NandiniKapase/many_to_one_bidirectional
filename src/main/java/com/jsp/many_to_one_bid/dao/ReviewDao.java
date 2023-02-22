package com.jsp.many_to_one_bid.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.many_to_one_bid.dto.Review;

public class ReviewDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Nandini");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	public Review createReview(Review review) {
		entityTransaction.begin();
		entityManager.persist(review);
		entityTransaction.commit();
		System.out.println("review added");
		return review;
		
		
	}
	public Review deleteReview(Review review) {
		Review review2=entityManager.find(Review.class, review.getId());
		entityTransaction.begin();
		entityManager.remove(review2);
		entityTransaction.commit();
		System.out.println("review deleted");
		return review2;
		
	}
	public Review updateReview(Review review) {
		Review review2=entityManager.find(Review.class, review.getId());
		if(review2!=null) {
			review2.getRating();
			review2.getStatus();
			review2.getProduct();
			entityTransaction.begin();
			entityManager.merge(review2);
			entityTransaction.commit();
		}
		return review2;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
