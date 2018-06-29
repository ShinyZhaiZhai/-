package com.example.exam.controller;

import com.example.exam.entity.AdmissionsList;
import com.example.exam.service.AdmissionsListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admissionsList")
public class AdmissionsListController {
    private final AdmissionsListService admissionsListService;

    @Autowired
    public AdmissionsListController(AdmissionsListService admissionsListService){
        this.admissionsListService = admissionsListService;
    }

    @GetMapping("/all")
    public List<AdmissionsList> getAllAdmissionsList(){
        List<AdmissionsList> admissionsListList = admissionsListService.getAllAdmissionsList();
        return admissionsListList;
    }

}
