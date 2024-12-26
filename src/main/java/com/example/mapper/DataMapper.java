package com.example.mapper;

import com.example.Common.pojo.Data;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface DataMapper {

    List<Data> selectAllData();

    List<Data> selectDataByPage(@Param("offset") int offset, @Param("pageSize") int pageSize);

    List<Data> selectDataByWarehouseName(@Param("warehouseName") String warehouseName);

    List<Data> selectDataByDeviceName(@Param("deviceName") String deviceName);

    List<Data> selectByCreateTimeRange(@Param("startTime") Date startTime, @Param("endTime") Date endTime);


    int insertData(Data data);

    int deleteData(int id);

}
