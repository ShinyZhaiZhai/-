package com.example.exam.service;


import com.example.exam.entity.AdmissionsList;
import com.example.exam.mapper.AdmissionsListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdmissionsListService {

    private final AdmissionsListMapper admissionsListMapper;

    @Autowired
    public AdmissionsListService(AdmissionsListMapper admissionsListMapper){
        this.admissionsListMapper = admissionsListMapper;
    }

    /**
     * 获取所有的考生档案
     * @return AdmissionsListList 所有的考生档案的List
     */
    public List<AdmissionsList> getAllAdmissionsList(){
        List<AdmissionsList> admissionsListList = admissionsListMapper.getAll();
        return admissionsListList;
    }
}
