package com.retalcar.bus.service;

import com.retalcar.bus.domain.Car;
import com.retalcar.bus.vo.CarVo;
import com.retalcar.sys.utils.DataGridView;

/**
 * @author laiyunjing
 * @version 1.0
 * @date 2020/6/15 0015 09:55
 */
public interface CarService {

    /**
     * 查询所有车辆
     * @param carVo
     * @return
     */
    public DataGridView queryAllCar(CarVo carVo);
    /**
     * 添加车辆
     * @param carVo
     */
    public void addCar(CarVo carVo);
    /**
     * 修改车辆
     * @param carVo
     */
    public void updateCar(CarVo carVo);
    /**
     * 根据id删除车辆
     * @param carid
     */
    public void deleteCar(String carnumber);
    /**
     * 批量删除车辆
     * @param carVo
     */
    public void deleteBatchCar(String [] carnumbers);

    /**
     * 根据车牌号查询
     * @param carnumber
     * @return
     */
    public Car queryCarByCarNumber(String carnumber);
}
