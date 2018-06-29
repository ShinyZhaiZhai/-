package com.example.exam.service;

import com.example.exam.entity.View_ExamineeFile;
import com.example.exam.mapper.View_ExamineeFileMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class View_ExamineeFileService {
    private final View_ExamineeFileMapper view_ExamineeFileMapper;

    @Autowired
    public View_ExamineeFileService(View_ExamineeFileMapper view_ExamineeFileMapper){
        this.view_ExamineeFileMapper = view_ExamineeFileMapper;
    }

    /**
     * 获取所有的考生档案
     * @return view_ExamineeFileList 所有的考生档案的List
     */

    public List<View_ExamineeFile> getAllView_ExamineeFile(){
        List<View_ExamineeFile> view_ExamineeFileList = view_ExamineeFileMapper.getAll();
        return  view_ExamineeFileList;
    }
}
