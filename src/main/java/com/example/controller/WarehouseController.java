package com.example.controller;

import com.example.Common.pojo.Warehouse;
import com.example.Common.result.Result;
import com.example.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/warehouse")
public class WarehouseController {

    @Autowired
    private WarehouseService warehouseService;

    @GetMapping
    public Result selectAllWarehouse() {
        List<Warehouse> warehouses = warehouseService.selectAllWarehouse();
        return Result.success(warehouses);
    }

    @GetMapping("/byPage")
    public Result selectWarehouseByPage(@RequestParam("pageNum") int pageNum, @RequestParam("pageSize")int pageSize) {
        List<Warehouse> warehouses = warehouseService.selectWarehouseByPage(pageNum, pageSize);
        return Result.success(warehouses);
    }

    @GetMapping("/byName")
    public Result selectWarehouseByName(String warehouseName) {
        List<Warehouse> warehouses = warehouseService.selectWarehouseByName(warehouseName);
        return Result.success(warehouses);

    }

    @GetMapping("/byCode")
    public Result selectWarehouseByCode(String warehouseCode) {
        List<Warehouse> warehouses = warehouseService.selectWarehouseByCode(warehouseCode);
        return Result.success(warehouses);
    }

    @DeleteMapping
    public Result deleteWarehouseById(Integer id) {
        int delete = warehouseService.deleteWarehouseById(id);
        if (delete > 0) return Result.success();
        else return Result.error("删除失败");
    }

    @PutMapping
    public Result updateWarehouse(Warehouse warehouse) {
        int update = warehouseService.updateWarehouse(warehouse);
        if (update > 0) return Result.success();
        else return Result.error("更新失败");
    }

    @PostMapping
    public Result insertWarehouse(Warehouse warehouse) {
        int insert = warehouseService.insertWarehouse(warehouse);
        if (insert > 0) return Result.success();
        else return Result.error("插入失败");
    }

}
