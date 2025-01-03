package com.example.service.impl;

import com.example.Common.pojo.Device;
import com.example.mapper.DeviceMapper;
import com.example.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceServiceImpl implements DeviceService {

    @Autowired
    private DeviceMapper deviceMapper;

    @Override
    public List<Device> selectAllDevice() {
        return deviceMapper.selectAllDevice();
    }

    @Override
    public List<Device> selectDeviceByPage(int pageNum, int pageSize) {
        int offset = (pageNum -1) * pageSize;
        return deviceMapper.selectDeviceByPage(offset, pageSize);
    }

    @Override
    public List<Device> selectDeviceByName(String deviceName) {
        return deviceMapper.selectDeviceByName(deviceName);
    }

    @Override
    public List<Device> selectDeviceByWarehouseName(String warehouseName) {
        return deviceMapper.selectDeviceByWarehouseName(warehouseName);
    }

    @Override
    public Device selectDeviceById(Integer id) {
        return deviceMapper.selectDeviceById(id);
    }

    @Override
    public int updateDevice(Device device) {
        int i = deviceMapper.updateDevice(device);
        if (i == 1) {
            return 1;
        }
        return 0;
    }

    @Override
    public int insertDevice(Device device) {
        int i = deviceMapper.insertDevice(device);
        if (i == 1) {
            return 1;
        }
        return 0;
    }

    @Override
    public int deleteDeviceById(Integer id) {
        int i = deviceMapper.deleteDeviceById(id);
        if (i == 1) {
            return 1;
        }
        return 0;
    }
}
