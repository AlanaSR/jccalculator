package com.jcbasket.jcbasket.controller;

import com.jcbasket.jcbasket.service.BasketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class BasketController {

    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public void add(@RequestParam List<Integer> items) {
        basketService.add(items);
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return basketService.get();
    }

}

