package com.zhg.javakc.modules.test.controller;

import com.zhg.javakc.modules.test.entity.TestEntity;
import com.zhg.javakc.modules.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author lisiyu
 * @Date 19/8/22 - 11:49
 */
@Controller
@RequestMapping("test")
public class TestController {

    @Autowired
    TestService testService;

    public ModelAndView queryAll(TestEntity testEntity, HttpServletRequest request, HttpServletResponse response){
        // ##调用service方法查询数据库test表数据信息

        return null;
    }


}
