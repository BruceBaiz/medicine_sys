package com.example.service.impl;

import com.example.Common.pojo.Warehouse;
import com.example.mapper.WarehouseMapper;
import com.example.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseServiceImpl implements WarehouseService {

    @Autowired
    private WarehouseMapper warehouseMapper;

    @Override
    public List<Warehouse> selectWarehouseByPage(int pageNum, int pageSize) {
        int offset = (pageNum - 1) * pageSize;
        return warehouseMapper.selectWarehouseByPage(offset, pageSize);
    }

    @Override
    public List<Warehouse> selectWarehouseByName(String warehouseName) {
        return warehouseMapper.selectWarehouseByName(warehouseName);
    }

    @Override
    public List<Warehouse> selectWarehouseByCode(String warehouseCode) {
        return warehouseMapper.selectWarehouseByCode(warehouseCode);
    }

    @Override
    public List<Warehouse> selectAllWarehouse() {
        return warehouseMapper.selectAllWarehouse();
    }

    @Override
    public Warehouse selectWarehouseById(Integer id) {
        return warehouseMapper.selectWarehouseById(id);
    }

    @Override
    public int deleteWarehouseById(Integer id) {
        if (warehouseMapper.deleteWarehouseById(id) == 1){
            return 1;
        }
        return 0;
    }

    @Override
    public int updateWarehouse(Warehouse warehouse) {
        int i = warehouseMapper.updateWarehouse(warehouse);
        if (i == 1){
            return 1;
        }
        return 0;
    }

    @Override
    public int insertWarehouse(Warehouse warehouse) {
        int i = warehouseMapper.insertWarehouse(warehouse);
        if (i == 1){
            return 1;
        }
        return 0;
    }
}
