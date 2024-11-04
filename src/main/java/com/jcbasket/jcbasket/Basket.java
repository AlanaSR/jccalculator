package com.jcbasket.jcbasket;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Basket {
    private final List<Integer> goods;

    public Basket(List<Integer> goods) {
        this.goods = goods;
    }


    public Integer addItem(Integer item) {
        goods.add(item);
        return item;
    }

    public List<Integer> getItems() {
        return new ArrayList<>(goods);
    }
}
