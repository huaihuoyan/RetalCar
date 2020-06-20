package com.retalcar.sys.controller;

/**
 * @author laiyunjing
 * @version 1.0
 * @date 2020/5/23 0023 下午 6:26
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 工作台的控制器
 * @author LJH
 *
 */
@Controller
@RequestMapping("desk")
public class DeskManager {


    /**
     * 跳转到工作台的页面
     */
    @RequestMapping("toDeskManager")
    public String toDeskManager() {
        return "system/main/deskManager";
    }

}
