package com.example.exam.mapper;

import com.example.exam.entity.View_ExamineeFile;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface View_ExamineeFileMapper {
    @Select("SELECT * FROM View_ExamineeFile")
    List<View_ExamineeFile> getAll();
}
