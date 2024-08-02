package com.acl.digital.homework.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class FunBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date postDate;

    private String postCategory;

    private String author;

    @Column(length = 500)
    private String content;

    private Long viewCount;
}
