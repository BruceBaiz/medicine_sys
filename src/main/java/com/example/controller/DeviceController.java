package com.example.controller;

import com.example.Common.pojo.Device;
import com.example.Common.result.Result;
import com.example.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/device")
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    @GetMapping
    public Result selectAllDevice() {
        return Result.success(deviceService.selectAllDevice());
    }

    @GetMapping("/byId")
    public Result selectDeviceById(Integer id) {
        return Result.success(deviceService.selectDeviceById(id));
    }

    @GetMapping("/byPage")
    public Result selectDeviceByPage(int pageNum, int pageSize) {
        return Result.success(deviceService.selectDeviceByPage(pageNum, pageSize));
    }

    @GetMapping("/byName")
    public Result selectDeviceByName(String deviceName) {
        return Result.success(deviceService.selectDeviceByName(deviceName));
    }

    @GetMapping("/byWarehouseName")
    public Result selectDeviceByWarehouseName(String warehouseName) {
        return Result.success(deviceService.selectDeviceByWarehouseName(warehouseName));
    }

    @PutMapping
    public Result updateDevice(Device device) {
        int i = deviceService.updateDevice(device);
        if (i == 1) {
            return Result.success();
        }
        return Result.error("更新失败");
    }

    @PostMapping
    public Result insertDevice(Device device) {
        int i = deviceService.insertDevice(device);
        if (i == 1) {
            return Result.success();
        }
        return Result.error("插入失败");
    }

    @DeleteMapping
    public Result deleteDeviceById(Integer id) {
        int i = deviceService.deleteDeviceById(id);
        if (i == 1) {
            return Result.success();
        }
        return Result.error("删除失败");
    }

}
