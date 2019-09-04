package com.zhg.javakc.modules.vehicle.person.controller;

import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.base.util.CommonUtil;
import com.zhg.javakc.modules.vehicle.motorcadeManage.entity.MotorcadeEntity;
import com.zhg.javakc.modules.vehicle.person.entity.StaffEntity;
import com.zhg.javakc.modules.vehicle.person.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author Liu
 * @2019/9/2 9:52
 */
@Controller
@RequestMapping("person")
public class PersonController {
    @Autowired
    PersonService personService;

    @RequestMapping("save")
    public String save(StaffEntity entity,@RequestParam("Mid")String Mid){
        //生成UUid
        entity.setId(CommonUtil.uuid());
        entity.setMot_id(Mid);
        //逻辑层
        personService.save(entity);
        return "redirect:http://localhost:8080/javakc_ssm/motorcade/queryAll.do";
    }
    //加载load
    //加载
    @RequestMapping("load")
    public String load (@RequestParam("id") String id , ModelMap modelMap){
        //逻辑层
       StaffEntity entity=personService.get(id);
        modelMap.put("entity",entity);
        return "vehicle/person/update";
    }
    //修改
    @RequestMapping("update")
    public String update( StaffEntity entity){
        personService.update(entity);
        return "redirect:http://localhost:8080/javakc_ssm/motorcade/queryAll.do";
    }
}
