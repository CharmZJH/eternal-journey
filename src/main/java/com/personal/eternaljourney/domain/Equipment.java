package com.personal.eternaljourney.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author ZhouJieHao
 * @version V1.0
 * @date 2021/06/17 10:57
 * @description null
 */
@Data
@Entity
@Table(name = "equ_equipment")
public class Equipment implements Serializable {

    private static final long serialVersionUID = 4911750977518840448L;


    /**
     * 主键
     */
    @Id
    @Column(name = "ID", length = 32)
    private String id;

    /**
     * 序号
     */
    @Column(name = "ORDER_NUMBER", length = 20)
    private String orderNumber;

    /**
     * 装备名称
     */
    @Column(name = "EQUIPMENT_NAME", length = 50)
    private String equipmentName;

    /**
     * 装备类型
     */
    @Column(name = "EQUIPMENT_TYPE", length = 20)
    private String equipmentType;

    /**
     * 力量
     */
    @Column(name = "STR", precision = 32, scale = 2)
    private BigDecimal str = BigDecimal.ZERO;

    /**
     * 魔力
     */
    @Column(name = "MAG", precision = 32, scale = 2)
    private BigDecimal mag = BigDecimal.ZERO;

    /**
     * 灵巧
     */
    @Column(name = "DEX", precision = 32, scale = 2)
    private BigDecimal dex = BigDecimal.ZERO;

    /**
     * 幸运
     */
    @Column(name = "LUK", precision = 32, scale = 2)
    private BigDecimal luk = BigDecimal.ZERO;

    /**
     * 耐力
     */
    @Column(name = "VIT", precision = 32, scale = 2)
    private BigDecimal vit = BigDecimal.ZERO;

    /**
     * 描述
     */
    @Column(name = "REMARK")
    private String remark;

    /**
     * 更新人
     */
    @Column(name = "CREATED_BY", length = 32)
    private String createdBy;

    /**
     * 创建时间
     */
    @Column(name = "CREATED_TIME")
    private Date createdTime;

    /**
     * 更新人
     */
    @Column(name = "UPDATED_BY", length = 32)
    private String updatedBy;

    /**
     * 更新时间
     */
    @Column(name = "UPDATED_TIME")
    private Date updatedTime;

}
