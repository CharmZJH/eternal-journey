package com.personal.eternaljourney.service;

import com.personal.eternaljourney.domain.Equipment;
import com.personal.eternaljourney.vo.EquipmentVo;

import java.util.List;

/**
 * @Author ZhouJieHao
 * @Date 2021/6/17 11:20
 * @Version 1.0
 */
public interface EquipmentService {

    //加载
    List<Equipment> load();

    //保存和更新
    void save(EquipmentVo equipmentVo);

    //删除
    void delete(String id);
}
