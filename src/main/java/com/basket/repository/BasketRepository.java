package com.basket.repository;

import com.basket.model.Bye;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
@Repository
public class BasketRepository {

    private final Map<Integer, Bye> byeMap;

    public BasketRepository() {
        byeMap = new HashMap<>();

        byeMap.put(1, new Bye("хлеб", 1));
        byeMap.put(2, new Bye("крупа", 2));
        byeMap.put(3, new Bye("яйца", 3));
    }

    public Map<Integer, Bye> getByeMap() {
        return byeMap;
    }
}
