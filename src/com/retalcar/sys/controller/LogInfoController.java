package com.retalcar.sys.controller;

import com.retalcar.sys.service.LogInfoService;
import com.retalcar.sys.utils.DataGridView;
import com.retalcar.sys.utils.ResultObj;
import com.retalcar.sys.vo.LogInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author laiyunjing
 * @version 1.0
 * @date 2020/6/10 0010 18:12
 */
@RestController
@RequestMapping("logInfo")
public class LogInfoController {

    @Autowired
    private LogInfoService logInfoService;

    /**
     * 加载日志列表返回DataGridView
     */
    @RequestMapping("loadAllLogInfo")
    public DataGridView loadAllLogInfo(LogInfoVo logInfoVo) {
        return this.logInfoService.queryAllLogInfo(logInfoVo);
    }

    /**
     * 删除日志
     */
    @RequestMapping("deleteLogInfo")
    public ResultObj deleteLogInfo(LogInfoVo logInfoVo) {
        try {
            this.logInfoService.deleteLogInfo(logInfoVo.getId());
            return ResultObj.DELETE_SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ResultObj.DELETE_ERROR;
        }
    }

    /**
     * 批量删除日志
     */
    @RequestMapping("deleteBatchLogInfo")
    public ResultObj deleteBatchLogInfo(LogInfoVo logInfoVo) {
        try {
            this.logInfoService.deleteBatchLogInfo(logInfoVo.getIds());
            return ResultObj.DELETE_SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ResultObj.DELETE_ERROR;
        }
    }

}
