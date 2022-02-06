package com.basket.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cart {

    private final List<Integer> userCurrentBarcodeList = new ArrayList<>();

    public List<Integer> getUserCurrentBarcodeList() {
        return Collections.unmodifiableList(userCurrentBarcodeList);
    }

    public List<Integer> addBarcode(List<Integer> newBarcodes) {
        userCurrentBarcodeList.addAll(newBarcodes);
        return newBarcodes;
    }
}



