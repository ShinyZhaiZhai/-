package com.example.exam.controller;

import com.example.exam.entity.Examinee_file;
import com.example.exam.service.ExamineeFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/examinee_file")
public class ExamineeFileController {

    private final ExamineeFileService examineeFileService;

    @Autowired
    public ExamineeFileController(ExamineeFileService examineeFileService) {
        this.examineeFileService = examineeFileService;
    }

    @GetMapping("/all")
    public List<Examinee_file> getAllExamineeFile() {
        List<Examinee_file> examineeFileList = examineeFileService.getAllExamineeFile();
        return examineeFileList;
    }

}

