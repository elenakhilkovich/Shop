package com.basket.service;

import com.basket.model.Bye;
import com.basket.repository.BasketRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ShopServiceImpl implements ShopService {


    private List<Bye> userByeList;
    private List<Bye> userCurrentByeList;

    public void ShopServiceImpl() {
        userByeList = new ArrayList<>();
        userCurrentByeList = new ArrayList<>();
    }

    @Autowired
    private BasketRepository basketRepository;

    public ShopServiceImpl(List<Bye> userByeList, List<Bye> userCurrentByeList) {
        this.userByeList = userByeList;
        this.userCurrentByeList = userCurrentByeList;
    }

    // public List<Bye> addBye(List<Integer> byeId) {
    //     userCurrentByeList.clear();
    //}

    @Override
    public List<Bye> addBye(List<Integer> byeId) {
        userCurrentByeList.clear();

        for (int i = 0; i < byeId.size(); i++) {
            if (basketRepository.getByeMap().containsKey(byeId.get(i))) {
                Bye newBye = basketRepository.getByeMap().get(byeId.get(i));
                userCurrentByeList.add(newBye);
                userByeList.add(newBye);
            }
        }
        return userCurrentByeList;
    }

    @Override
    public List<Bye> getShop() {
        return userByeList;
    }

}
