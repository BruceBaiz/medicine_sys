package com.example.mapper;

import com.example.entity.Data;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DataMapper {

    List<Data> selectAllData();

    int insertData(Data data);

    int deleteData(int id);

}
