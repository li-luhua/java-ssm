package com.zhg.javakc.modules.vehicle.motorcadeManage.entity;

import com.zhg.javakc.base.entity.BaseEntity;
import com.zhg.javakc.modules.vehicle.person.entity.StaffEntity;

import java.util.ArrayList;
import java.util.List;

public class MotorcadeEntity extends BaseEntity<MotorcadeEntity> {

  //车队主键
  private String id;
  //车队名称
  private String mot_name;
  //车队所属公司
  private String mot_company;
  //车队传真
  private String mot_fax;
  //车队电话
  private String mot_phone;
  //车队地址
  private String mot_site;
  //车队备注
  private String mot_remark;
  //配送信息主键
  private String distributionId;

  //关联人员表List 一对多
  private List<StaffEntity> staffList=new ArrayList<>();

  public List<StaffEntity> getStaffList() {
    return staffList;
  }

  public void setStaffList(List<StaffEntity> staffList) {
    this.staffList = staffList;
  }



  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getMot_name() {
    return mot_name;
  }

  public void setMot_name(String mot_name) {
    this.mot_name = mot_name;
  }

  public String getMot_company() {
    return mot_company;
  }

  public void setMot_company(String mot_company) {
    this.mot_company = mot_company;
  }

  public String getMot_fax() {
    return mot_fax;
  }

  public void setMot_fax(String mot_fax) {
    this.mot_fax = mot_fax;
  }

  public String getMot_phone() {
    return mot_phone;
  }

  public void setMot_phone(String mot_phone) {
    this.mot_phone = mot_phone;
  }

  public String getMot_site() {
    return mot_site;
  }

  public void setMot_site(String mot_site) {
    this.mot_site = mot_site;
  }

  public String getMot_remark() {
    return mot_remark;
  }

  public void setMot_remark(String mot_remark) {
    this.mot_remark = mot_remark;
  }

  public String getDistributionId() {
    return distributionId;
  }

  public void setDistributionId(String distributionId) {
    this.distributionId = distributionId;
  }

}
