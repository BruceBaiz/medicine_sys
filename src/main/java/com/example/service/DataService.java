package com.example.service;

import com.example.Common.pojo.Data;

import java.util.Date;
import java.util.List;

public interface DataService {

    List<Data> selectAllData();

    List<Data> selectDataByPage(int offset, int pageSize);

    List<Data> selectDataByWarehouseName(String warehouseName);

    List<Data> selectDataByDeviceName(String deviceName);

    List<Data> selectByCreateTimeRange(Date startTime, Date endTime);

    int deleteData(Integer id);

}
