package com.retalcar.sys.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.retalcar.sys.domain.LogInfo;
import com.retalcar.sys.mapper.LogInfoMapper;
import com.retalcar.sys.service.LogInfoService;
import com.retalcar.sys.utils.DataGridView;
import com.retalcar.sys.vo.LogInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author laiyunjing
 * @version 1.0
 * @date 2020/6/10 0010 18:10
 */
@Service
public class LogInfoServiceImpl implements LogInfoService {

    @Autowired
    private LogInfoMapper logInfoMapper;


    @Override
    public DataGridView queryAllLogInfo(LogInfoVo logInfoVo) {
        Page<Object> page= PageHelper.startPage(logInfoVo.getPage(), logInfoVo.getLimit());
        List<LogInfo> data = this.logInfoMapper.queryAllLogInfo(logInfoVo);
        return new DataGridView(page.getTotal(), data);
    }

    @Override
    public void addLogInfo(LogInfoVo logInfoVo) {
        this.logInfoMapper.insertSelective(logInfoVo);
    }

    @Override
    public void deleteLogInfo(Integer logInfoid) {
        this.logInfoMapper.deleteByPrimaryKey(logInfoid);
    }

    @Override
    public void deleteBatchLogInfo(Integer[] ids) {
        for (Integer integer : ids) {
            this.deleteLogInfo(integer);
        }
    }

}
