package com.example.exam.service;


import com.example.exam.entity.PreliminaryTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.exam.mapper.PreliminaryTestMapper;



@Service
public class PreliminaryTestService {

    private final PreliminaryTestMapper preliminaryTestMapper;

    @Autowired
    public PreliminaryTestService(PreliminaryTestMapper preliminaryTestMapper){this.preliminaryTestMapper = preliminaryTestMapper;}

    /**
     * 获取所有的考生档案
     * @return PreliminaryTestList 所有的考生档案的List
     */

    public List<PreliminaryTest> getAllPreliminaryTest() {
        List<PreliminaryTest> preliminaryTestList = preliminaryTestMapper.getAll();
        return preliminaryTestList;
    }
}
