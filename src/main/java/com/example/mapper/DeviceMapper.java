package com.example.mapper;

import com.example.entity.Device;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeviceMapper {

    // 查询所有设备
    public List<Device> selectAllDevice();

    // 根据设备id查询设备
    public Device selectDeviceById(Integer id);

    // 添加设备
    public int addDevice(Device device);

    //


}
