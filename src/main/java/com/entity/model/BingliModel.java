package com.entity.model;

import com.entity.BingliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 病例
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class BingliModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 医生
     */
    private Integer yishengId;


    /**
     * 病例编号
     */
    private String bingliUuidNumber;


    /**
     * 患者姓名
     */
    private String bingliName;


    /**
     * 患者手机号
     */
    private String huanzhePhone;


    /**
     * 患者身份证号
     */
    private String huanzheIdNumber;


    /**
     * 病例文件
     */
    private String bingliFile;


    /**
     * 病例备注
     */
    private String bingliContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：医生
	 */
    public Integer getYishengId() {
        return yishengId;
    }


    /**
	 * 设置：医生
	 */
    public void setYishengId(Integer yishengId) {
        this.yishengId = yishengId;
    }
    /**
	 * 获取：病例编号
	 */
    public String getBingliUuidNumber() {
        return bingliUuidNumber;
    }


    /**
	 * 设置：病例编号
	 */
    public void setBingliUuidNumber(String bingliUuidNumber) {
        this.bingliUuidNumber = bingliUuidNumber;
    }
    /**
	 * 获取：患者姓名
	 */
    public String getBingliName() {
        return bingliName;
    }


    /**
	 * 设置：患者姓名
	 */
    public void setBingliName(String bingliName) {
        this.bingliName = bingliName;
    }
    /**
	 * 获取：患者手机号
	 */
    public String getHuanzhePhone() {
        return huanzhePhone;
    }


    /**
	 * 设置：患者手机号
	 */
    public void setHuanzhePhone(String huanzhePhone) {
        this.huanzhePhone = huanzhePhone;
    }
    /**
	 * 获取：患者身份证号
	 */
    public String getHuanzheIdNumber() {
        return huanzheIdNumber;
    }


    /**
	 * 设置：患者身份证号
	 */
    public void setHuanzheIdNumber(String huanzheIdNumber) {
        this.huanzheIdNumber = huanzheIdNumber;
    }
    /**
	 * 获取：病例文件
	 */
    public String getBingliFile() {
        return bingliFile;
    }


    /**
	 * 设置：病例文件
	 */
    public void setBingliFile(String bingliFile) {
        this.bingliFile = bingliFile;
    }
    /**
	 * 获取：病例备注
	 */
    public String getBingliContent() {
        return bingliContent;
    }


    /**
	 * 设置：病例备注
	 */
    public void setBingliContent(String bingliContent) {
        this.bingliContent = bingliContent;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
