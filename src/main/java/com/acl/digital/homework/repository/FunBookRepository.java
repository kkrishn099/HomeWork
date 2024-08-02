package com.acl.digital.homework.repository;

import com.acl.digital.homework.entity.FunBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FunBookRepository extends JpaRepository<FunBook,Long> {
    List<FunBook> findTop10ByPostCategoryOrderByViewCountDesc(String postCategory);
    List<FunBook> findByAuthor(String author);
}
