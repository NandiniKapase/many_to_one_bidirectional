package com.jsp.many_to_one_bid.service;

import com.jsp.many_to_one_bid.dao.ProductDao;
import com.jsp.many_to_one_bid.dto.Product;

public class ProductService {
	ProductDao productDao=new ProductDao();
	public Product createProduct(Product product) {
		return productDao.createProduct(product);
		
	}
	public Product deleteProductById(int id) {
		return productDao.deleteProductById(id);
	}
	public Product updateProduct(Product product) {
		return productDao.updateProduct(product);
	}
}
