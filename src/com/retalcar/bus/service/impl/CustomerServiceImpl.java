package com.retalcar.bus.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.retalcar.bus.domain.Customer;
import com.retalcar.bus.mapper.CustomerMapper;
import com.retalcar.bus.service.CustomerService;
import com.retalcar.bus.vo.CustomerVo;
import com.retalcar.sys.utils.DataGridView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author laiyunjing
 * @version 1.0
 * @date 2020/6/12 0012 18:29
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public DataGridView queryAllCustomer(CustomerVo customerVo) {
        Page<Object> page= PageHelper.startPage(customerVo.getPage(), customerVo.getLimit());
        List<Customer> data = this.customerMapper.queryAllCustomer(customerVo);
        return new DataGridView(page.getTotal(), data);
    }

    @Override
    public void addCustomer(CustomerVo customerVo) {
        this.customerMapper.insertSelective(customerVo);
    }

    @Override
    public void deleteCustomer(String identity) {
        this.customerMapper.deleteByPrimaryKey(identity);
    }

    @Override
    public void deleteBatchCustomer(String[] identitys) {
        for (String identity : identitys) {
            this.deleteCustomer(identity);
        }
    }

    @Override
    public void updateCustomer(CustomerVo customerVo) {
        this.customerMapper.updateByPrimaryKeySelective(customerVo);
    }

    @Override
    public Customer queryCustomerByIdentity(String identity) {
        // TODO Auto-generated method stub
        return this.customerMapper.selectByPrimaryKey(identity);
    }

    @Override
    public List<Customer> queryAllCustomerForList(CustomerVo customerVo) {
        return this.customerMapper.queryAllCustomer(customerVo);
    }




}
