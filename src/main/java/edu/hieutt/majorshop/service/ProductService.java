package edu.hieutt.majorshop.service;

import edu.hieutt.majorshop.model.Product;
import edu.hieutt.majorshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository repository;

    public List<Product> getAllProduct() {
        return repository.findAll();
    }

    public void addProduct(Product product) {
        repository.save(product);
    }

    public void removeProductById(long id) {
        repository.deleteById(id);
    }

    public Optional<Product> getProductById(long id) {
        return repository.findById(id);
    }

    public List<Product> getAllProductByCategoryId(int id) {
        return repository.findAllByCategoryId(id);
    }
}
