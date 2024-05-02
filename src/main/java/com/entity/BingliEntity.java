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
 * 病例
 *
 * @author 
 * @email
 */
@TableName("bingli")
public class BingliEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public BingliEntity() {

	}

	public BingliEntity(T t) {
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
     * 病例编号
     */
    @TableField(value = "bingli_uuid_number")

    private String bingliUuidNumber;


    /**
     * 患者姓名
     */
    @TableField(value = "bingli_name")

    private String bingliName;


    /**
     * 患者手机号
     */
    @TableField(value = "huanzhe_phone")

    private String huanzhePhone;


    /**
     * 患者身份证号
     */
    @TableField(value = "huanzhe_id_number")

    private String huanzheIdNumber;


    /**
     * 病例文件
     */
    @TableField(value = "bingli_file")

    private String bingliFile;


    /**
     * 病例备注
     */
    @TableField(value = "bingli_content")

    private String bingliContent;


    /**
     * 添加时间
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
	 * 设置：病例编号
	 */
    public String getBingliUuidNumber() {
        return bingliUuidNumber;
    }


    /**
	 * 获取：病例编号
	 */

    public void setBingliUuidNumber(String bingliUuidNumber) {
        this.bingliUuidNumber = bingliUuidNumber;
    }
    /**
	 * 设置：患者姓名
	 */
    public String getBingliName() {
        return bingliName;
    }


    /**
	 * 获取：患者姓名
	 */

    public void setBingliName(String bingliName) {
        this.bingliName = bingliName;
    }
    /**
	 * 设置：患者手机号
	 */
    public String getHuanzhePhone() {
        return huanzhePhone;
    }


    /**
	 * 获取：患者手机号
	 */

    public void setHuanzhePhone(String huanzhePhone) {
        this.huanzhePhone = huanzhePhone;
    }
    /**
	 * 设置：患者身份证号
	 */
    public String getHuanzheIdNumber() {
        return huanzheIdNumber;
    }


    /**
	 * 获取：患者身份证号
	 */

    public void setHuanzheIdNumber(String huanzheIdNumber) {
        this.huanzheIdNumber = huanzheIdNumber;
    }
    /**
	 * 设置：病例文件
	 */
    public String getBingliFile() {
        return bingliFile;
    }


    /**
	 * 获取：病例文件
	 */

    public void setBingliFile(String bingliFile) {
        this.bingliFile = bingliFile;
    }
    /**
	 * 设置：病例备注
	 */
    public String getBingliContent() {
        return bingliContent;
    }


    /**
	 * 获取：病例备注
	 */

    public void setBingliContent(String bingliContent) {
        this.bingliContent = bingliContent;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
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
        return "Bingli{" +
            "id=" + id +
            ", yishengId=" + yishengId +
            ", bingliUuidNumber=" + bingliUuidNumber +
            ", bingliName=" + bingliName +
            ", huanzhePhone=" + huanzhePhone +
            ", huanzheIdNumber=" + huanzheIdNumber +
            ", bingliFile=" + bingliFile +
            ", bingliContent=" + bingliContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
