package com.example.exam.mapper;

import com.example.exam.entity.PreliminaryTest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PreliminaryTestMapper {
    @Select("SELECT * FROM PreliminaryTest")
    List<PreliminaryTest> getAll();
}
