package com.example.exam.controller;

import com.example.exam.entity.View_ExamineeFile;
import com.example.exam.service.View_ExamineeFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/view_ExamineeFile")
public class View_ExamineeFileController {
    private final View_ExamineeFileService view_ExamineeFileService;

    @Autowired
    public View_ExamineeFileController(View_ExamineeFileService view_ExamineeFileService){
        this.view_ExamineeFileService = view_ExamineeFileService;
    }

    @GetMapping("/all")
    public List<View_ExamineeFile> getAllView_ExamineeFil(){
        List<View_ExamineeFile> view_ExamineeFileList = view_ExamineeFileService.getAllView_ExamineeFile();
        return view_ExamineeFileList;
    }
}
