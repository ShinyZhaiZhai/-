package com.example.exam.controller;

import com.example.exam.entity.MajorCatalogue;
import com.example.exam.service.MajorCatalogueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/majorCatalogue")
public class MajorCatalogueController {
    private final MajorCatalogueService majorCatalogueService;

    @Autowired
    public MajorCatalogueController(MajorCatalogueService majorCatalogueService){
        this.majorCatalogueService = majorCatalogueService;
    }

    @GetMapping("/all")
    public List<MajorCatalogue> getAllMajorCatalogue(){
        List<MajorCatalogue> majorCatalogueList = majorCatalogueService.getAllMajorCatalogue();
        return majorCatalogueList;
    }
}
