package com.jsp.many_to_one_bid.controller;

import com.jsp.many_to_one_bid.dto.Product;
import com.jsp.many_to_one_bid.dto.Review;
import com.jsp.many_to_one_bid.service.ProductService;
import com.jsp.many_to_one_bid.service.ReviewService;

public class TestUpdate {

	public static void main(String[] args) {
		ProductService productService=new ProductService();
		ReviewService reviewService=new ReviewService();
		
		Product product=new Product();
		product.setId(2);
		product.setBrand("adidas");
		product.setType("footwear");
		product.setPrice(1200);
		productService.updateProduct(product);
		
		Review review=new Review();
		review.setId(2);
		review.setStatus("very good");
		review.setRating(4);
		review.setProduct(product);
		reviewService.updateReview(review);
		
	}

}
