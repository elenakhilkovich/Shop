package com.basket.controller;

import com.basket.service.ShopService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/order")
@RestController
public class ShopController {

    private final ShopService shopService;

    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping("/add")
    public List<Integer> addBarcodes(@RequestParam List<Integer> newBarcodes) {
        return shopService.addBarcodes(newBarcodes);
    }

    @GetMapping("/get")
    public List<Integer> getBarcodes() {
        return shopService.getBarcodes();
    }
}
