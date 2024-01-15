package com.synccosdemo.orderservice.service;

import com.synccosdemo.orderservice.dto.OrderRequest;

public interface OrderService {
    void create(OrderRequest orderRequest);
}
