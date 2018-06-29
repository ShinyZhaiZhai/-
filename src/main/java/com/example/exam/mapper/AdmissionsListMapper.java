package com.example.exam.mapper;

import com.example.exam.entity.AdmissionsList;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface AdmissionsListMapper {

    @Select("SELECT * FROM AdmissionsList")
    List<AdmissionsList> getAll();
}
