package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookInfoService {

    @Autowired
    PriceService priceService;

    @Autowired
    CatalogueService catalogueService;

    public String getBookInfo(int itemNo){
        StringBuilder sb = new StringBuilder();
        sb.append(" Title :" + catalogueService.getTitle(itemNo));
        sb.append(" Price:" + priceService.getPrice(itemNo));
        sb.append(" Content:" + catalogueService.getContent(itemNo));
        return sb.toString();
    }
}
