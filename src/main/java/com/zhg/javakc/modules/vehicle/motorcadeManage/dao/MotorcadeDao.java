package com.zhg.javakc.modules.vehicle.motorcadeManage.dao;

import com.zhg.javakc.base.dao.BaseDao;
import com.zhg.javakc.base.dao.MyBatisDao;
import com.zhg.javakc.modules.test.entity.TestEntity;
import com.zhg.javakc.modules.vehicle.motorcadeManage.entity.MotorcadeEntity;
import com.zhg.javakc.modules.vehicle.person.entity.StaffEntity;

import java.util.List;

/**
 * @Author lisiyu
 * @Date 19/8/22 - 12:04
 */
@MyBatisDao
public interface MotorcadeDao extends BaseDao<MotorcadeEntity> {
    public List<MotorcadeEntity> queryPerson(MotorcadeEntity entity);
}
