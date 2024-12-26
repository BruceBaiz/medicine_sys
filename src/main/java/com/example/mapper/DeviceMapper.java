package com.example.mapper;

import com.example.Common.pojo.Device;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DeviceMapper {

    // 查询所有设备
    List<Device> selectAllDevice();

    List<Device> selectDeviceByPage(@Param("offset") int offset, @Param("limit") int limit);

    List<Device> selectDeviceByName(String deviceName);

    List<Device> selectDeviceByWarehouseName(String warehouseName);

    // 根据设备id查询设备
    Device selectDeviceById(Integer id);

    int updateDevice(Device device);

    // 添加设备
    int insertDevice(Device device);

    //删除设备
    int deleteDeviceById(Integer id);




}
