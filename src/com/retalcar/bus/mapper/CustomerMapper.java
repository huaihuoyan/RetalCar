package com.retalcar.bus.mapper;

import com.retalcar.bus.domain.Customer;

import java.util.List;

/**
 * @author laiyunjing
 * @version 1.0
 * @date 2020/6/12 0012 18:15
 */
public interface CustomerMapper {

    int deleteByPrimaryKey(String identity);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(String identity);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

    List<Customer> queryAllCustomer(Customer customer);
}
