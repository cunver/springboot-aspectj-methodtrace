package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class PriceService {

    public double getPrice(int itemNo){
            switch (itemNo) {
                case 1 :
                    return 10.d;
                case 2 :
                    return 20.d;
                default:
                    return 0.d;
            }
    }

}
