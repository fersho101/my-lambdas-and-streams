package com.ferchoo.fundamentals;

import java.util.List;

public class ProductDB implements DatabaseService<Product> {
    @Override
    public Product getById(Long id) {
        Product p = new Product();
        p.setId(id);
        p.setName("Galletas");
        p.setPrice(20.0);
        return p;
    }

    @Override
    public List<Product> getAllRecords() {
        return List.of();
    }
}
