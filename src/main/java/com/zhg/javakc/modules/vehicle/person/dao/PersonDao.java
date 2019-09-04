package com.zhg.javakc.modules.vehicle.person.dao;

import com.zhg.javakc.base.dao.BaseDao;
import com.zhg.javakc.base.dao.MyBatisDao;
import com.zhg.javakc.modules.vehicle.motorcadeManage.entity.MotorcadeEntity;
import com.zhg.javakc.modules.vehicle.person.entity.StaffEntity;
import org.apache.poi.ss.formula.functions.T;

import java.util.List;

/**
 * @Author lisiyu
 * @Date 19/8/22 - 12:04
 */
@MyBatisDao
public interface PersonDao extends BaseDao<StaffEntity> {
    public List<StaffEntity> queryPerson(StaffEntity staffEntity);

}
