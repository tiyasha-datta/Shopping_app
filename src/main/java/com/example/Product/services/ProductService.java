package com.example.Product.services;

import com.example.Product.entities.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    public Product createProduct(Product product);
    public Product updateProduct(int productId,Product product);
    public void deleteProduct(int productId);
    public Product getProductbyId(int productId);
    public List<Product> getProducts();

}
