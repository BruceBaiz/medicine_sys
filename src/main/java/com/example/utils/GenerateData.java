//package com.example.utils;
//
//import com.example.Common.pojo.Data;
//import com.example.mapper.DataMapper;
//import com.example.mapper.DeviceMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.Random;
//
//@Component
//public class GenerateData implements CommandLineRunner {
//
//    @Autowired
//    private DataMapper dataMapper;
//
//    @Autowired
//    private DeviceMapper deviceMapper;
//
//    private static final int deviceId = 1;
//    private static final int warehouseId = 1;
//
//
//    public void run(String... args) throws Exception {
//
//        while(true)
//        {
//            Data data = new Data();
//            data.setDeviceId(deviceId);
//            data.setWarehouseId(warehouseId);
//            data.setTempData(new Random().nextDouble() * 30);
//            data.setHumiData(new Random().nextDouble() * 70);
//            data.setCreateBy("superadmin");
//            data.setUpdateBy("superadmin");
//            dataMapper.insertData(data);
//            Thread.sleep(1000);
//        }
//
//    }
//
//
//
//}
