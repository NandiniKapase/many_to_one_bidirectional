package com.jsp.many_to_one_bid.controller;

import com.jsp.many_to_one_bid.dto.Product;
import com.jsp.many_to_one_bid.dto.Review;
import com.jsp.many_to_one_bid.service.ProductService;
import com.jsp.many_to_one_bid.service.ReviewService;

public class TestDelete {

	public static void main(String[] args) {
		ProductService productService=new ProductService();
		ReviewService reviewService=new ReviewService();
		Product product=new Product();
		product.setId(1);
		productService.deleteProductById(1);
		Review review=new Review();
		review.setId(1);
		reviewService.deleteReview(review);
		System.out.println("suscessfully deleted");
		
		
	}

}
