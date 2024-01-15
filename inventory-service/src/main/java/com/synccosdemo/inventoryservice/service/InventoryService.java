package com.synccosdemo.inventoryservice.service;

import com.synccosdemo.inventoryservice.dto.InventoryResponse;

import java.util.List;

public interface InventoryService {
    List<InventoryResponse> isInStock (List<String> skuCode);
}
