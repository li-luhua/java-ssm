package com.zhg.javakc.modules.vehicle.person.service;

import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.base.service.BaseService;
import com.zhg.javakc.modules.vehicle.motorcadeManage.dao.MotorcadeDao;
import com.zhg.javakc.modules.vehicle.motorcadeManage.entity.MotorcadeEntity;
import com.zhg.javakc.modules.vehicle.person.dao.PersonDao;
import com.zhg.javakc.modules.vehicle.person.entity.StaffEntity;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author lisiyu
 * @Date 19/8/22 - 11:52
 */
@Service
public class PersonService extends BaseService<PersonDao, StaffEntity> {
    @Autowired
    private PersonDao dao;

    public Page<StaffEntity> queryPerson(String Mid, Page<StaffEntity> page) {
        //设置分页参数
        StaffEntity staffEntity=new StaffEntity();
        MotorcadeEntity motorcadeEntity=new MotorcadeEntity();
        motorcadeEntity.setId(Mid);
        staffEntity.setPage(page);
        //staffEntity.setMotorcadeEntity(motorcadeEntity);
        //执行分页查询
        page.setList(dao.queryPerson(staffEntity));
        return page;

    }
}
