package com.personal.eternaljourney.service.impl;

import com.personal.eternaljourney.config.ApiResult;
import com.personal.eternaljourney.domain.Equipment;
import com.personal.eternaljourney.repository.EquipmentRepository;
import com.personal.eternaljourney.service.EquipmentService;
import com.personal.eternaljourney.utils.Tools;
import com.personal.eternaljourney.vo.EquipmentVo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author ZhouJieHao
 * @Date 2021/6/17 11:20
 * @Version 1.0
 */
@Service
public class EquipmentServiceImpl implements EquipmentService {

    @Resource
    private EquipmentRepository equipmentRepository;

    @Override
    public ApiResult<List<Equipment>> load(){

        List<Equipment> equipmentList = equipmentRepository.findAll();

        return ApiResult.success("接口调用成功", equipmentList, equipmentList.size());

    }

    @Override
    @Transactional
    public void save(EquipmentVo equipmentVo){

        Equipment equipment = new Equipment();
        BeanUtils.copyProperties(equipmentVo, equipment);

        if (equipment.getId() == null || "".equals(equipment.getId())){

            equipment.setId(Tools.createID());
        }
        equipmentRepository.save(equipment);

    }


    @Override
    @Transactional
    public void delete(String id){

        equipmentRepository.deleteById(id);

    }

}
