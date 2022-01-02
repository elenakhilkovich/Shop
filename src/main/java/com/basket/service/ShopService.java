package com.basket.service;

import com.basket.model.Bye;

import java.util.List;

public interface ShopService {
    List<Bye> addBye(List<Integer> byeId);
    List<Bye> getShop();
}
