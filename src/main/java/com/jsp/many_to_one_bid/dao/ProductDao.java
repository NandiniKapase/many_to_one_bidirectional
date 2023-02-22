package com.jsp.many_to_one_bid.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.many_to_one_bid.dto.Product;

public class ProductDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Nandini");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	public Product createProduct(Product product) {
		entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();
		System.out.println("product inserted");
		return product;
		
	}
	public Product deleteProductById(int id) {
		Product product2=entityManager.find(Product.class,id);
		entityTransaction.begin();
		entityManager.remove(product2);
		entityTransaction.commit();
		System.out.println("product deleted");
		return product2;
	}
	public Product updateProduct(Product product) {
		Product product2=entityManager.find(Product.class, product.getId());
		if(product2!=null) {
			product2.getName();
			product2.getBrand();
			product2.getPrice();
			product2.getType();
			System.out.println("record updated");
			
		}
		else {
			System.out.println("record not updated");
		}
		entityTransaction.begin();
		entityManager .merge(product2);
		entityTransaction.commit();
		return product2;
		
		
	}
	


}
