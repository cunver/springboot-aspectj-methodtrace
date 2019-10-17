package com.example.demo.controller;

import com.example.demo.service.BookInfoService;
import com.example.demo.trace.TraceMonitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    BookInfoService bookInfoService;

    @Autowired
    TraceMonitor traceMonitor;

    @GetMapping("/getBookInfo/{itemNo}")
    public String getBookInfo(@PathVariable int itemNo) {
        try{
            return bookInfoService.getBookInfo(itemNo);
        }finally {
            traceMonitor.printTrace();
        }
    }

}
