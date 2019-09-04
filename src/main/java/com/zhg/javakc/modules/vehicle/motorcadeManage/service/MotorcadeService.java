package com.zhg.javakc.modules.vehicle.motorcadeManage.service;

import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.base.service.BaseService;
import com.zhg.javakc.modules.vehicle.motorcadeManage.dao.MotorcadeDao;
import com.zhg.javakc.modules.vehicle.motorcadeManage.entity.MotorcadeEntity;
import com.zhg.javakc.modules.vehicle.person.entity.StaffEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author lisiyu
 * @Date 19/8/22 - 11:52
 */
@Service
public class MotorcadeService extends BaseService<MotorcadeDao, MotorcadeEntity> {
    @Autowired
    private MotorcadeDao motorcadeDao;

    //查看全部
    public Page<MotorcadeEntity> queryAll(MotorcadeEntity motorcadeEntity , Page<MotorcadeEntity > page){
        //设置分页参数
        motorcadeEntity.setPage(page);
        //执行分页查询
        page.setList(motorcadeDao.findList(motorcadeEntity));
        return page;
    }

    public Page<MotorcadeEntity> queryPerson(String Mid, Page<MotorcadeEntity> page) {
        //设置分页参数
        MotorcadeEntity motorcadeEntity=new MotorcadeEntity();
        motorcadeEntity.setId(Mid);
        //执行分页查询
        page.setList(dao.queryPerson(motorcadeEntity));
        return page;

    }
}
