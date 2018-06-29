package com.example.exam.mapper;

import com.example.exam.entity.ProfessionalWordbook;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProfessionalWordbookMapper {
    @Select("SELECT * FROM ProfessionalWordbook")
    List<ProfessionalWordbook> getAll();
}
