package com.example.controller;

import com.example.Common.result.Result;
import com.example.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
@RestController
@RequestMapping("/data")
public class DataController {

    @Autowired
    private DataService dataService;

    @GetMapping
    public Result selectAllData() {
        return Result.success(dataService.selectAllData());
    }

    @GetMapping("/byPage")
    public Result selectDataByPage(int offset, int pageSize) {
        return Result.success(dataService.selectDataByPage(offset, pageSize));
    }

    @GetMapping("/byWarehouseName")
    public Result selectDataByWarehouseName(String warehouseName) {
        return Result.success(dataService.selectDataByWarehouseName(warehouseName));
    }

    @GetMapping("/byDeviceName")
    public Result selectDataByDeviceName(String deviceName) {
        return Result.success(dataService.selectDataByDeviceName(deviceName));
    }

    @GetMapping("/byCreateTimeRange")
    public Result selectByCreateTimeRange(Date startTime, Date endTime) {
        return Result.success(dataService.selectByCreateTimeRange(startTime, endTime));
    }

    @GetMapping("/delete")
    public Result deleteData(Integer id) {
        return Result.success(dataService.deleteData(id));
    }

}
