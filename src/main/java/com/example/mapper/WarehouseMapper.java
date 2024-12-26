package com.example.mapper;

import com.example.Common.pojo.Warehouse;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WarehouseMapper {
    // 查询所有仓库
    List<Warehouse> selectAllWarehouse();

    List<Warehouse> selectWarehouseByPage(@Param("offset") int offset, @Param("limit") int limit);

    List<Warehouse> selectWarehouseByName(String warehouseName);

    List<Warehouse> selectWarehouseByCode(String warehouseCode);

    // 根据仓库id查询仓库
    Warehouse selectWarehouseById(Integer id);

    int deleteWarehouseById(Integer id);

    int updateWarehouse(Warehouse warehouse);

    // 添加仓库
    int insertWarehouse(Warehouse warehouse);


}
