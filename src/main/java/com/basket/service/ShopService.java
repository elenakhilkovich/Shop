package com.basket.service;

import java.util.List;

public interface ShopService {
    List<Integer> addBarcodes(List<Integer> newBarcodes);
    List<Integer> getBarcodes();
}
