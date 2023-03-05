package com.example.taskmastermongodb.controller;

import com.example.taskmastermongodb.repository.MemberRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    private MemberRepository memberRepository;

    public MemberController(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
}
