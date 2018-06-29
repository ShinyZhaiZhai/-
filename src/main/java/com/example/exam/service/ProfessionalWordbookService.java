package com.example.exam.service;

import com.example.exam.entity.ProfessionalWordbook;
import com.example.exam.mapper.ProfessionalWordbookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessionalWordbookService {
    private final ProfessionalWordbookMapper professionalWordbookMapper;

    @Autowired
    public ProfessionalWordbookService(ProfessionalWordbookMapper professionalWordbookMapper){
        this.professionalWordbookMapper  = professionalWordbookMapper;
    }
    /**
     * 获取所有的考生档案
     * @return professionalWordbookList 所有的考生档案的List
     */
    public List<ProfessionalWordbook> getAllProfessionalWordbook(){
        List< ProfessionalWordbook> professionalWordbookList = professionalWordbookMapper.getAll();
        return  professionalWordbookList;
    }
}
