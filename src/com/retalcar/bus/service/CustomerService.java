package com.retalcar.bus.service;

import com.retalcar.bus.domain.Customer;
import com.retalcar.bus.vo.CustomerVo;
import com.retalcar.sys.utils.DataGridView;

/**
 * @author laiyunjing
 * @version 1.0
 * @date 2020/6/12 0012 18:28
 */
public interface CustomerService {

    /**
     * 查询所有客户
     * @param customerVo
     * @return
     */
    public DataGridView queryAllCustomer(CustomerVo customerVo);
    /**
     * 添加客户
     * @param customerVo
     */
    public void addCustomer(CustomerVo customerVo);
    /**
     * 修改客户
     * @param customerVo
     */
    public void updateCustomer(CustomerVo customerVo);
    /**
     * 根据id删除客户
     * @param customerid
     */
    public void deleteCustomer(String identity);
    /**
     * 批量删除客户
     * @param customerVo
     */
    public void deleteBatchCustomer(String [] identitys);

    /**
     * 根据身份证号查询客户信息
     * @param identity
     * @return
     */
    public Customer queryCustomerByIdentity(String identity);
}
