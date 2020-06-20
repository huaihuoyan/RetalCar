package com.retalcar.sys.service;

import com.retalcar.sys.domain.User;
import com.retalcar.sys.utils.DataGridView;
import com.retalcar.sys.vo.RoleVo;
import com.retalcar.sys.vo.UserVo;

import java.util.List;

/**
 * @author laiyunjing
 * @version 1.0
 * @date 2020/5/23 0023 下午 3:26
 */
public interface UserService {
    User login(UserVo userVo);

    /**
     * 查询所有用户
     * @param userVo
     * @return
     */
    public DataGridView queryAllUser(UserVo userVo);
    /**
     * 添加用户
     * @param userVo
     */
    public void addUser(UserVo userVo);

    /**
     * 修改用户
     * @param userVo
     */
    public void updateUser(UserVo userVo);

    /**
     * 根据id删除用户
     * @param userid
     */
    public void deleteUser(Integer userid);

    /**
     * 批量删除用户
     * @param ids
     */
    public void deleteBatchUser(Integer [] ids);

    /**
     * 修改密码
     * @param userid
     */
    public void resetUserPwd(Integer userid);

    /**
     *  加载用户管理的分配角色的数据
     * @param userid
     * @return
     */
    DataGridView queryUserRole(Integer userid);

    /**
     * 保存用户和角色的关系
     * @param userVo
     */
    void saveUserRole(UserVo userVo);
}
