package com.retalcar.sys.service;

import com.retalcar.sys.domain.Role;
import com.retalcar.sys.utils.DataGridView;
import com.retalcar.sys.vo.RoleVo;

import java.util.List;

/**
 * @author laiyunjing
 * @version 1.0
 * @date 2020/6/5 0005 17:21
 */
public interface RoleService {

    /**
     * 查询所有角色返回
     * List<Role>
     */
    public List<Role> queryAllRoleForList(RoleVo roleVo);

    /**
     * 根据用户id查询用户的可用角色
     */
    public List<Role> queryRoleByUserIdForList(RoleVo roleVo,Integer userId);

    /**
     * 查询所有角色
     * @param roleVo
     * @return
     */
    public DataGridView queryAllRole(RoleVo roleVo);

    /**
     * 添加角色
     * @param roleVo
     */
    public void addRole(RoleVo roleVo);

    /**
     * 修改角色
     * @param roleVo
     */
    public void updateRole(RoleVo roleVo);

    /**
     * 根据id删除角色
     * @param roleid
     */
    public void deleteRole(Integer roleid);
    /**
     * 批量删除角色
     * @param roleVo
     */
    public void deleteBatchRole(Integer [] ids);

    /**
     * 加载角色管理分配菜单的json
     * @param roleid
     * @return
     */
    public DataGridView initRoleMenuTreeJson(Integer roleid);

    /**
     * 保存角色和菜单的关系
     * @param roleVo
     */
    public void saveRoleMenu(RoleVo roleVo);
}
