package com.retalcar.bus.mapper;

import com.retalcar.bus.domain.Car;

import java.util.List;

/**
 * @author laiyunjing
 * @version 1.0
 * @date 2020/6/12 0012 19:31
 */
public interface CarMapper {

    int deleteByPrimaryKey(String carnumber);

    int insert(Car record);

    int insertSelective(Car record);

    Car selectByPrimaryKey(String carnumber);

    int updateByPrimaryKeySelective(Car record);

    int updateByPrimaryKey(Car record);

    List<Car> queryAllCar(Car car);
}
