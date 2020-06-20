package com.retalcar.sys.controller;

import com.retalcar.sys.constast.SysConstast;
import com.retalcar.sys.domain.User;
import com.retalcar.sys.service.LogInfoService;
import com.retalcar.sys.service.UserService;
import com.retalcar.sys.utils.WebUtils;
import com.retalcar.sys.vo.LogInfoVo;
import com.retalcar.sys.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * @author laiyunjing
 * @version 1.0
 * @date 2020/5/23 0023 下午 3:29
 */
@Controller
@RequestMapping("login")
public class LoginController {
    @Autowired
    private UserService userService;

    @Autowired
    private LogInfoService logInfoService;

    /**
     * 跳转到登陆页面
     */
    @RequestMapping("toLogin")
    public String toLogin() {
        return "system/main/login";
    }

    /**
     * 登陆方法
     */
    @RequestMapping("login")
    public String login(UserVo userVo, Model model) {
        User user=this.userService.login(userVo);
        if(null!=user) {
            //放到session
            WebUtils.getHttpSession().setAttribute("user", user);
            //记录登陆日志 向sys_login_log里面插入数据
            LogInfoVo logInfoVo=new LogInfoVo();
            logInfoVo.setLogintime(new Date());
            logInfoVo.setLoginname(user.getRealname()+"-"+user.getLoginname());
            logInfoVo.setLoginip(WebUtils.getHttpServletRequest().getRemoteAddr());

            logInfoService.addLogInfo(logInfoVo);
            return "system/main/index";
        }else {
            model.addAttribute("error", SysConstast.USER_LOGIN_ERROR_MSG);
            return "system/main/login";
        }

    }
}
