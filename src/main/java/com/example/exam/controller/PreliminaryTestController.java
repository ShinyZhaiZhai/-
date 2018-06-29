package com.example.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.exam.entity.PreliminaryTest;
import com.example.exam.service.PreliminaryTestService;

import java.util.List;

@RestController
@RequestMapping("/preliminaryTest")
public class PreliminaryTestController {
    private final PreliminaryTestService preliminaryTestService;

    @Autowired
    public PreliminaryTestController(PreliminaryTestService preliminaryTestService){
        this.preliminaryTestService = preliminaryTestService;
    }

    @GetMapping("/all")
    public List<PreliminaryTest> getAllpreliminaryTest(){
        List<PreliminaryTest> preliminaryTestList = preliminaryTestService.getAllPreliminaryTest();
        return preliminaryTestList;
    }

}



