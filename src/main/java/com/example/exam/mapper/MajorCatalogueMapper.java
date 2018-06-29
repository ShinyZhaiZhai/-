package com.example.exam.mapper;

import com.example.exam.entity.MajorCatalogue;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MajorCatalogueMapper {

    @Select("SELECT * FROM MajorCatalogue")
    List<MajorCatalogue> getAll();

}
