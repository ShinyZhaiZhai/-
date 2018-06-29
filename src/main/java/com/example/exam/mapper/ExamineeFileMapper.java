package com.example.exam.mapper;

import com.example.exam.entity.Examinee_file;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ExamineeFileMapper {

    @Select("SELECT * FROM Examinee_file")
    List<Examinee_file> getAll();

}
