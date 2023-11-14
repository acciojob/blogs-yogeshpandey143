package com.dhrax.springbootswaggerimpl.service;

import com.dhrax.springbootswaggerimpl.entity.Product;
import com.dhrax.springbootswaggerimpl.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public List<Product> saveProductList(List<Product> productList){
        return productRepository.saveAll(productList);
    }

    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }
    public Product getProductById(int id){
        return productRepository.findById(id).orElse(null);
    }
    public Product getProductByName(String name){
        return productRepository.findByName(name);
    }

    public String deleteProduct(int id){
        productRepository.deleteById(id);
        return "Product removed !!" + id;
    }
    public Product updateProduct(Product product){
        Product existingProduct=productRepository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setQuantity(product.getQuantity());
        return productRepository.save(existingProduct);
    }


}
