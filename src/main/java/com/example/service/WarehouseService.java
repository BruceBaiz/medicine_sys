package com.example.service;


import com.example.entity.Warehouse;

import java.util.List;

public interface WarehouseService {

    // 查询所有仓库
    List<Warehouse> selectAllWarehouse();

    // 根据仓库id查询仓库
    Warehouse selectWarehouseById(Integer id);

    int deleteWarehouseById(Integer id);

    int updateWarehouse(Warehouse warehouse);

    // 添加仓库
    int insertWarehouse(Warehouse warehouse);
}