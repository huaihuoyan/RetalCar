package com.retalcar.stat.utils;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.LineCaptcha;

public class TestHuTool {

    public static void main(String[] args) {
        // 定义图形验证码的长和宽
        LineCaptcha lineCaptcha = CaptchaUtil.createLineCaptcha(200, 100);

        // 图形验证码写出，可以写出到文件，也可以写出到流
        lineCaptcha.write("d:/line.png");
        System.out.println(lineCaptcha.getCode());
    }

}
