package com.example.exam.controller;

import com.example.exam.entity.ProfessionalWordbook;
import com.example.exam.service.ProfessionalWordbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/professionalWordbook")
public class ProfessionalWordbookController {

    private final ProfessionalWordbookService professionalWordbookService;

    @Autowired
    public ProfessionalWordbookController(ProfessionalWordbookService professionalWordbookService){
        this.professionalWordbookService = professionalWordbookService;
    }

    @GetMapping("/all")
    public List<ProfessionalWordbook> getAllProfessionalWordbook(){
        List<ProfessionalWordbook> professionalWordbookList = professionalWordbookService.getAllProfessionalWordbook();
        return  professionalWordbookList;
    }
}
