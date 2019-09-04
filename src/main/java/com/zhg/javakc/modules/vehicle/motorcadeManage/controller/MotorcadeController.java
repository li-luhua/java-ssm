package com.zhg.javakc.modules.vehicle.motorcadeManage.controller;

import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.base.util.CommonUtil;
import com.zhg.javakc.modules.test.entity.TestEntity;
import com.zhg.javakc.modules.vehicle.motorcadeManage.entity.MotorcadeEntity;
import com.zhg.javakc.modules.vehicle.motorcadeManage.service.MotorcadeService;
import com.zhg.javakc.modules.vehicle.person.entity.StaffEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author lisiyu
 * @Date 19/8/22 - 11:49
 */
@Controller
@RequestMapping("motorcade")
public class MotorcadeController {

    @Autowired
    MotorcadeService motorcadeService;

    //查询全部
    @RequestMapping("queryAll")
    public ModelAndView queryAll(MotorcadeEntity motorcadeEntity, HttpServletRequest request, HttpServletResponse response){
        // ##调用service方法查询数据库motorcade表数据信息
        ModelAndView modelAndView=new ModelAndView("vehicle/motorcade/list");
        modelAndView.addObject("page",motorcadeService.queryAll(motorcadeEntity,new Page<MotorcadeEntity>(request,response)));
        return modelAndView;
    }


    //新增
    @RequestMapping("save")
    public String save(MotorcadeEntity entity){
        //生成UUid
        entity.setId(CommonUtil.uuid());
        //逻辑层
        motorcadeService.save(entity);
        return "redirect:queryAll.do";
    }

    //加载load
    //加载
    @RequestMapping("load")
    public String load (String ids , ModelMap modelMap){
        //逻辑层
        MotorcadeEntity entity=motorcadeService.get(ids);
        modelMap.put("entity",entity);
        return "vehicle/motorcade/update";
    }

    //修改
    @RequestMapping("update")
    public String update( MotorcadeEntity entity){
        motorcadeService.update(entity);
        return "redirect:queryAll.do";
    }

    //删除
    @RequestMapping("delete")
    public String delete(String [] ids){
        motorcadeService.delete(ids);
        return "redirect:queryAll.do";
    }

    //查询人员
    //查询全部
    //查询全部
    @RequestMapping("queryPerson")
    public ModelAndView queryPerson(@RequestParam("id") String Mid, HttpServletRequest request, HttpServletResponse response){
        // ##调用service方法查询数据库Staffentity表数据信息
        ModelAndView modelAndView=new ModelAndView("vehicle/person/list");
        modelAndView.addObject("page",motorcadeService.queryPerson(Mid,new Page<MotorcadeEntity>(request,response)));
        return modelAndView;
    }

}
