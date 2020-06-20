package com.retalcar.sys.mapper;

import com.retalcar.sys.domain.LogInfo;

import java.util.List;

/**
 * @author laiyunjing
 * @version 1.0
 * @date 2020/6/10 0010 18:03
 */
public interface LogInfoMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(LogInfo record);

    int insertSelective(LogInfo record);

    LogInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LogInfo record);

    int updateByPrimaryKey(LogInfo record);

    /**
     * 查询日志
     */
    List<LogInfo> queryAllLogInfo(LogInfo logInfo);
}
