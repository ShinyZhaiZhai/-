package com.example.exam.service;

import com.example.exam.entity.MajorCatalogue;
import com.example.exam.mapper.MajorCatalogueMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MajorCatalogueService {

    private final MajorCatalogueMapper majorCatalogueMapper;

    @Autowired
    public MajorCatalogueService(MajorCatalogueMapper majorCatalogueMapper) {
        this.majorCatalogueMapper = majorCatalogueMapper;
    }
    /**
     * 获取所有的考生档案
     * @return MajorCatalogueList 所有的考生档案的List
     */

    public List<MajorCatalogue> getAllMajorCatalogue() {
        List<MajorCatalogue> MajorCatalogueList = majorCatalogueMapper.getAll();
                return MajorCatalogueList;
    }
}
