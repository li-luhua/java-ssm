package com.zhg.javakc.modules.vehicle.person.entity;

import com.zhg.javakc.base.entity.BaseEntity;


//人员实体类
public class StaffEntity extends BaseEntity<StaffEntity> {

  private String id;
  private String position;
  private String name;
  private String site;
  private String phone;
  //车队外建
  private String mot_id;

  public String getMot_id() {
    return mot_id;
  }

  public void setMot_id(String mot_id) {
    this.mot_id = mot_id;
  }



  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getSite() {
    return site;
  }

  public void setSite(String site) {
    this.site = site;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

}
