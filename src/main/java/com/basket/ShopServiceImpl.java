package com.basket;

import com.basket.model.Bye;
import com.basket.repository.BasketRepository;
import com.basket.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class ShopServiceImpl implements ShopService {


    private List<Bye> userByeList;
    private List<Bye> userCurrentByeList;

    public ShopServiceImpl() {
        userByeList = new ArrayList<>();
        userCurrentByeList = new ArrayList<>();
    }

    @Autowired
    private BasketRepository basketRepository;

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
