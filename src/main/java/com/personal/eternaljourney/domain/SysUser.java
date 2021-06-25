package com.personal.eternaljourney.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @author ZhouJieHao
 * @version V1.0
 * @date 2021/06/21 10:25
 * @description
 */
@Data
@Entity
@Table(name = "sys_user")
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1481518019292150296L;

    /**
     * 主键
     */
    @Id
    @Column(name = "ID", length = 32)
    private String id;

    /**
     * 用户名
     */
    @Column(name = "USER_NAME", length = 32)
    private String userName;

    /**
     * 帐号
     */
    @Column(name = "SYS_ACCOUNT", length = 32)
    private String sysAccount;

    /**
     * 密码
     */
    @Column(name = "SYS_PASSWORD", length = 32)
    private String sysPassword;

    /**
     * 联系方式
     */
    @Column(name = "CELL_PHONE", length = 32)
    private String cellPhone;

    /**
     * 备注
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
