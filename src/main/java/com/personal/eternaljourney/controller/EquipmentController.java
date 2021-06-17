package com.personal.eternaljourney.controller;

import com.alibaba.fastjson.JSONObject;
import com.personal.eternaljourney.config.ReLog;
import com.personal.eternaljourney.domain.Equipment;
import com.personal.eternaljourney.service.EquipmentService;
import com.personal.eternaljourney.vo.EquipmentVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author ZhouJieHao
 * @Date 2021/6/17 12:47
 * @Version 1.0
 */
@ReLog
@RestController
@RequestMapping("/equ")
public class EquipmentController {

    @Resource
    private EquipmentService equipmentService;

    @PostMapping("/load")
    public List<Equipment> load(){

        return equipmentService.load();
    }


    @PostMapping("/save")
    public void save(@RequestBody EquipmentVo equipmentVo){

        equipmentService.save(equipmentVo);

    }

    @PostMapping("/delete")
    public void delete(@RequestBody JSONObject jsonObject){

        String id = jsonObject.getString("id");
        equipmentService.delete(id);

    }
}
