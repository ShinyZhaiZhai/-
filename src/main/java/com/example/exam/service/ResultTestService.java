package com.example.exam.service;

import com.example.exam.entity.ResultTest;
import com.example.exam.mapper.ResultTestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultTestService {
    private final ResultTestMapper resultTestMapper;

    @Autowired
    public ResultTestService(ResultTestMapper resultTestMapper){
        this.resultTestMapper = resultTestMapper;
    }

    /**
     * 获取所有的考生档案
     * @return resultTestList 所有的考生档案的List
     */
    public List<ResultTest> getAllResultTest(){
        List<ResultTest> resultTestList = resultTestMapper.getAll();
        return resultTestList;
    }

}
