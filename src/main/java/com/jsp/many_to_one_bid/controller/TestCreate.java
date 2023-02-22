package com.jsp.many_to_one_bid.controller;

import java.util.ArrayList;

import javax.persistence.EntityTransaction;

import com.jsp.many_to_one_bid.dto.Product;
import com.jsp.many_to_one_bid.dto.Review;
import com.jsp.many_to_one_bid.service.ProductService;
import com.jsp.many_to_one_bid.service.ReviewService;

public class TestCreate {

	public static void main(String[] args) {
		ProductService productService=new ProductService();
		ReviewService reviewService=new ReviewService();
		
		
		Product product=new Product();
		product.setBrand("Spark");
		product.setName("shoes");
		product.setPrice(1300);
		product.setType("footwear");
		productService.createProduct(product);
		
		Review review1 =new Review();
		review1.setStatus("good");
		review1.setRating(3);
		review1.setProduct(product);
		reviewService.createReview(review1);
		Review review2=new Review();
		review2.setStatus(" good");
		review2.setRating(2);
		review2.setProduct(product);
		reviewService.createReview(review2);
		
		Review review3=new Review();
		review3.setStatus("poor");
		review3.setRating(4);
		review3.setProduct(product);
		reviewService.createReview(review3);
		ArrayList<Review> al=new ArrayList();
		al.add(review3);
		al.add(review2);
		al.add(review1);
		
		System.out.println("suscessfully added");
		
		
	}

}
