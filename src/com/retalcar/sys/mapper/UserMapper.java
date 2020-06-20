package com.retalcar.sys.mapper;

import com.retalcar.sys.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author laiyunjing
 * @version 1.0
 * @date 2020/5/23 0023 下午 3:18
 */
public interface UserMapper {

    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 登录
     * @param user
     * @return
     */
    User login(User user);

    /**
     * 查询用户
     */
    List<User> queryAllUser(User user);

    /**
     * 保存用户和角色的关系
     * @param userid
     * @param rid
     */
    void insertUserRole(@Param("uid")Integer userid, @Param("rid")Integer rid) ;
}
