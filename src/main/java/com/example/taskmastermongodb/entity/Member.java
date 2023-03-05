package com.example.taskmastermongodb.entity;

import org.springframework.data.annotation.Id;

public class Member {
    @Id
    private String id;
    private String name;
    private String email;
}
