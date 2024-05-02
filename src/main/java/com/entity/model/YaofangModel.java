package com.entity.model;

import com.entity.YaofangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 药方
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YaofangModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 病例
     */
    private Integer bingliId;


    /**
     * 药方编号
     */
    private String yaofangUuidNumber;


    /**
     * 药方名称
     */
    private String yaofangName;


    /**
     * 药方类型
     */
    private Integer yaofangTypes;


    /**
     * 药方详情
     */
    private String bingliFile;


    /**
     * 药方备注
     */
    private String bingliContent;


    /**
     * 开方时间
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
	 * 获取：病例
	 */
    public Integer getBingliId() {
        return bingliId;
    }


    /**
	 * 设置：病例
	 */
    public void setBingliId(Integer bingliId) {
        this.bingliId = bingliId;
    }
    /**
	 * 获取：药方编号
	 */
    public String getYaofangUuidNumber() {
        return yaofangUuidNumber;
    }


    /**
	 * 设置：药方编号
	 */
    public void setYaofangUuidNumber(String yaofangUuidNumber) {
        this.yaofangUuidNumber = yaofangUuidNumber;
    }
    /**
	 * 获取：药方名称
	 */
    public String getYaofangName() {
        return yaofangName;
    }


    /**
	 * 设置：药方名称
	 */
    public void setYaofangName(String yaofangName) {
        this.yaofangName = yaofangName;
    }
    /**
	 * 获取：药方类型
	 */
    public Integer getYaofangTypes() {
        return yaofangTypes;
    }


    /**
	 * 设置：药方类型
	 */
    public void setYaofangTypes(Integer yaofangTypes) {
        this.yaofangTypes = yaofangTypes;
    }
    /**
	 * 获取：药方详情
	 */
    public String getBingliFile() {
        return bingliFile;
    }


    /**
	 * 设置：药方详情
	 */
    public void setBingliFile(String bingliFile) {
        this.bingliFile = bingliFile;
    }
    /**
	 * 获取：药方备注
	 */
    public String getBingliContent() {
        return bingliContent;
    }


    /**
	 * 设置：药方备注
	 */
    public void setBingliContent(String bingliContent) {
        this.bingliContent = bingliContent;
    }
    /**
	 * 获取：开方时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：开方时间
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
