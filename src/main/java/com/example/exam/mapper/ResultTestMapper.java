package com.example.exam.mapper;

import com.example.exam.entity.ResultTest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface ResultTestMapper {
    @Select("SELECT * FROM ResultTest")
    List<ResultTest> getAll();
}
