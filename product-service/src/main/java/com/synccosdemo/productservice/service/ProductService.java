package com.synccosdemo.productservice.service;

import com.synccosdemo.productservice.dto.ProductRequest;
import com.synccosdemo.productservice.dto.ProductResponse;

import java.util.List;

public interface ProductService {
    void create (ProductRequest productRequest);

    List<ProductResponse> getAll ();
}
