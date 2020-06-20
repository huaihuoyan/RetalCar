package com.retalcar.bus.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.retalcar.bus.domain.Car;
import com.retalcar.bus.mapper.CarMapper;
import com.retalcar.bus.service.CarService;
import com.retalcar.bus.vo.CarVo;
import com.retalcar.sys.constast.SysConstast;
import com.retalcar.sys.utils.AppFileUtils;
import com.retalcar.sys.utils.DataGridView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author laiyunjing
 * @version 1.0
 * @date 2020/6/15 0015 10:01
 */
@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarMapper carMapper;

    @Override
    public DataGridView queryAllCar(CarVo carVo) {
        Page<Object> page= PageHelper.startPage(carVo.getPage(), carVo.getLimit());
        List<Car> data = this.carMapper.queryAllCar(carVo);
        return new DataGridView(page.getTotal(), data);
    }

    @Override
    public void addCar(CarVo carVo) {
        this.carMapper.insertSelective(carVo);
    }

    @Override
    public void deleteCar(String carnumber) {
        //先删除图片
        Car car=this.carMapper.selectByPrimaryKey(carnumber);
        //如果不是默认图片就删除
        if(!car.getCarimg().equals(SysConstast.DEFAULT_CAR_IMG)) {
            AppFileUtils.deleteFileUsePath(car.getCarimg());
        }
        //删除数据库的数据
        this.carMapper.deleteByPrimaryKey(carnumber);

    }

    @Override
    public void deleteBatchCar(String[] carnumbers) {
        for (String carnumber : carnumbers) {
            this.deleteCar(carnumber);
        }
    }

    @Override
    public void updateCar(CarVo carVo) {
        this.carMapper.updateByPrimaryKeySelective(carVo);
    }

    @Override
    public Car queryCarByCarNumber(String carnumber) {
        return this.carMapper.selectByPrimaryKey(carnumber);
    }
}
