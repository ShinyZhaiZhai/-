package com.example.exam.controller;

import com.example.exam.entity.ResultTest;
import com.example.exam.service.ResultTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/resultTest")
public class ResultTestController {
    private final ResultTestService resultTestService;

    @Autowired
    public ResultTestController(ResultTestService resultTestService){
        this.resultTestService = resultTestService;
    }

    @GetMapping("/all")
    public List<ResultTest> getAllResultTest(){
        List<ResultTest> resultTestList = resultTestService.getAllResultTest();
        return resultTestList;
    }

}
