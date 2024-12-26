package com.example.service.impl;

import com.example.Common.pojo.Data;
import com.example.mapper.DataMapper;
import com.example.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DataServiceImpl implements DataService {

    @Autowired
    private DataMapper dataMapper;

    @Override
    public List<Data> selectAllData() {
        return dataMapper.selectAllData();
    }

    @Override
    public List<Data> selectDataByPage(int offset, int pageSize) {
        return dataMapper.selectDataByPage(offset, pageSize);
    }

    @Override
    public List<Data> selectDataByWarehouseName(String warehouseName) {
        return dataMapper.selectDataByWarehouseName(warehouseName);
    }

    @Override
    public List<Data> selectDataByDeviceName(String deviceName) {
        return dataMapper.selectDataByDeviceName(deviceName);
    }

    @Override
    public List<Data> selectByCreateTimeRange(Date startTime, Date endTime) {
        return dataMapper.selectByCreateTimeRange(startTime, endTime);
    }

    @Override
    public int deleteData(Integer id) {
        return dataMapper.deleteData(id);
    }


}
