package com.acl.digital.homework.controller;

import com.acl.digital.homework.entity.FunBook;
import com.acl.digital.homework.service.FunBookService;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.anyString;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.util.Collections;

@WebMvcTest(FunBookController.class)
public class FunBookControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private FunBookService service;

    @Test
    void getTop10PostsByCategoryTest() throws Exception {
        when(service.getTop10PostsByCategory(anyString())).thenReturn(Collections.singletonList(new FunBook()));
        mockMvc.perform(get("/api/posts/top10/Music"))
                .andExpect(status().isOk());
    }

    @Test
    void getPostsByAuthorTest() throws Exception {
        when(service.getPostsByAuthor(anyString())).thenReturn(Collections.singletonList(new FunBook()));
        mockMvc.perform(get("/api/posts/author/Alice"))
                .andExpect(status().isOk());
    }
}
