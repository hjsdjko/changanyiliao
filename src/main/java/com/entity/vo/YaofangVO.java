package com.entity.vo;

import com.entity.YaofangEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 药方
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("yaofang")
public class YaofangVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 病例
     */

    @TableField(value = "bingli_id")
    private Integer bingliId;


    /**
     * 药方编号
     */

    @TableField(value = "yaofang_uuid_number")
    private String yaofangUuidNumber;


    /**
     * 药方名称
     */

    @TableField(value = "yaofang_name")
    private String yaofangName;


    /**
     * 药方类型
     */

    @TableField(value = "yaofang_types")
    private Integer yaofangTypes;


    /**
     * 药方详情
     */

    @TableField(value = "bingli_file")
    private String bingliFile;


    /**
     * 药方备注
     */

    @TableField(value = "bingli_content")
    private String bingliContent;


    /**
     * 开方时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：病例
	 */
    public Integer getBingliId() {
        return bingliId;
    }


    /**
	 * 获取：病例
	 */

    public void setBingliId(Integer bingliId) {
        this.bingliId = bingliId;
    }
    /**
	 * 设置：药方编号
	 */
    public String getYaofangUuidNumber() {
        return yaofangUuidNumber;
    }


    /**
	 * 获取：药方编号
	 */

    public void setYaofangUuidNumber(String yaofangUuidNumber) {
        this.yaofangUuidNumber = yaofangUuidNumber;
    }
    /**
	 * 设置：药方名称
	 */
    public String getYaofangName() {
        return yaofangName;
    }


    /**
	 * 获取：药方名称
	 */

    public void setYaofangName(String yaofangName) {
        this.yaofangName = yaofangName;
    }
    /**
	 * 设置：药方类型
	 */
    public Integer getYaofangTypes() {
        return yaofangTypes;
    }


    /**
	 * 获取：药方类型
	 */

    public void setYaofangTypes(Integer yaofangTypes) {
        this.yaofangTypes = yaofangTypes;
    }
    /**
	 * 设置：药方详情
	 */
    public String getBingliFile() {
        return bingliFile;
    }


    /**
	 * 获取：药方详情
	 */

    public void setBingliFile(String bingliFile) {
        this.bingliFile = bingliFile;
    }
    /**
	 * 设置：药方备注
	 */
    public String getBingliContent() {
        return bingliContent;
    }


    /**
	 * 获取：药方备注
	 */

    public void setBingliContent(String bingliContent) {
        this.bingliContent = bingliContent;
    }
    /**
	 * 设置：开方时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：开方时间
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

}
