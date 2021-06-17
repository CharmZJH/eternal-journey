package com.personal.eternaljourney.vo;

import lombok.Data;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

/**
 * @Author ZhouJieHao
 * @Date 2021/6/17 13:17
 * @Version 1.0
 */
@Data
public class EquipmentVo {

    /**
     * 主键
     */
    private String id;

    /**
     * 序号
     */
    private String orderNumber;

    /**
     * 装备名称
     */
    private String equipmentName;

    /**
     * 装备类型
     */
    private String equipmentType;

    /**
     * 力量
     */
    private BigDecimal str = BigDecimal.ZERO;
    ;

    /**
     * 魔力
     */
    private BigDecimal mag = BigDecimal.ZERO;
    ;

    /**
     * 灵巧
     */
    private BigDecimal dex = BigDecimal.ZERO;
    ;

    /**
     * 幸运
     */
    private BigDecimal luk = BigDecimal.ZERO;
    ;

    /**
     * 耐力
     */
    private BigDecimal vit = BigDecimal.ZERO;
    ;

    /**
     * 描述
     */
    private String remark;
}
