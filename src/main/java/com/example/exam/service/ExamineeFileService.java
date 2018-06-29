package com.example.exam.service;

import com.example.exam.entity.Examinee_file;
import com.example.exam.mapper.ExamineeFileMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamineeFileService {

    private final ExamineeFileMapper examineeFileMapper;

    @Autowired
    public ExamineeFileService(ExamineeFileMapper examineeFileMapper) {
        this.examineeFileMapper = examineeFileMapper;
    }

    /**
     * 获取所有的考生档案
     * @return examineeFileList 所有的考生档案的List
     */
    public List<Examinee_file> getAllExamineeFile() {
        List<Examinee_file> examineeFileList = examineeFileMapper.getAll();
        return examineeFileList;
    }
}
