package com.jay.springbootsamples.controller;

import com.jay.springbootsamples.entity.Reader;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reader")
public class ReaderController {

    @GetMapping("/hello")
    public Reader hello() {
        Reader reader = new Reader();
        reader.setUsername("jay");
        reader.setPassword("xxx");
        reader.setFullname("jay zhang");
        return reader;
    }

}
