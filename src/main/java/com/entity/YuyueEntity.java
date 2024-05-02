package com.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

/**
 * 医生预约
 *
 * @author 
 * @email
 */
@TableName("yuyue")
public class YuyueEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YuyueEntity() {

	}

	public YuyueEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 医生
     */
    @TableField(value = "yisheng_id")

    private Integer yishengId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 花费金额
     */
    @TableField(value = "yuyue_true_price")

    private Double yuyueTruePrice;


    /**
     * 预约状态
     */
    @TableField(value = "yuyue_yesno_types")

    private Integer yuyueYesnoTypes;


    /**
     * 预约日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @TableField(value = "yuyue_time")

    private Date yuyueTime;


    /**
     * 申请预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：医生
	 */
    public Integer getYishengId() {
        return yishengId;
    }


    /**
	 * 获取：医生
	 */

    public void setYishengId(Integer yishengId) {
        this.yishengId = yishengId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：花费金额
	 */
    public Double getYuyueTruePrice() {
        return yuyueTruePrice;
    }


    /**
	 * 获取：花费金额
	 */

    public void setYuyueTruePrice(Double yuyueTruePrice) {
        this.yuyueTruePrice = yuyueTruePrice;
    }
    /**
	 * 设置：预约状态
	 */
    public Integer getYuyueYesnoTypes() {
        return yuyueYesnoTypes;
    }


    /**
	 * 获取：预约状态
	 */

    public void setYuyueYesnoTypes(Integer yuyueYesnoTypes) {
        this.yuyueYesnoTypes = yuyueYesnoTypes;
    }
    /**
	 * 设置：预约日期
	 */
    public Date getYuyueTime() {
        return yuyueTime;
    }


    /**
	 * 获取：预约日期
	 */

    public void setYuyueTime(Date yuyueTime) {
        this.yuyueTime = yuyueTime;
    }
    /**
	 * 设置：申请预约时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：申请预约时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Yuyue{" +
            "id=" + id +
            ", yishengId=" + yishengId +
            ", yonghuId=" + yonghuId +
            ", yuyueTruePrice=" + yuyueTruePrice +
            ", yuyueYesnoTypes=" + yuyueYesnoTypes +
            ", yuyueTime=" + yuyueTime +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
