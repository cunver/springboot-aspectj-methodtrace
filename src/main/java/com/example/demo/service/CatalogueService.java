package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class CatalogueService {

    public String getContent(int itemNo){
        switch (itemNo) {
            case 1 :
                return "Lorem ipsum content 1.";
            case 2 :
                return "Lorem ipsum content 2.";
            default:
                return "Content not found.";
        }
    }


    public String getTitle(int itemNo){
        switch (itemNo) {
            case 1 :
                return "For whom the bell tolls";
            case 2 :
                return "Of mice and men";
            default:
                return "Title not found.";
        }
    }

}
