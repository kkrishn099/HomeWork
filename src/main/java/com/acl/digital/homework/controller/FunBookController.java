package com.acl.digital.homework.controller;

import com.acl.digital.homework.entity.FunBook;
import com.acl.digital.homework.service.FunBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class FunBookController {
    @Autowired
    private FunBookService service;

    @GetMapping("/top10/{category}")
    public List<FunBook> getTop10PostsByCategory(@PathVariable String category) {
        return service.getTop10PostsByCategory(category);
    }

    @GetMapping("/author/{author}")
    public List<FunBook> getPostsByAuthor(@PathVariable String author) {
        return service.getPostsByAuthor(author);
    }
    @GetMapping("/health")
    public String healthCheck(){
        return "Hi FunBook is Up and Running";
    }
}
