package com.basket.service;

import com.basket.model.Cart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {

    private final Cart cart;

    public ShopServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public List<Integer> addBarcodes(List<Integer> newBarcodes) {
        return cart.addBarcode(newBarcodes);
    }

    @Override
    public List<Integer> getBarcodes() {
        return cart.getUserCurrentBarcodeList();
    }

}
