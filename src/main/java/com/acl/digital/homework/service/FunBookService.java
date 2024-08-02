package com.acl.digital.homework.service;

import com.acl.digital.homework.entity.FunBook;
import com.acl.digital.homework.repository.FunBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FunBookService {
    @Autowired
    private FunBookRepository repository;

    public List<FunBook> getTop10PostsByCategory(String postCategory) {
        return repository.findTop10ByPostCategoryOrderByViewCountDesc(postCategory);
    }

    public List<FunBook> getPostsByAuthor(String author) {
        return repository.findByAuthor(author);
    }
}
