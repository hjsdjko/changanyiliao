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
 * 药方
 *
 * @author 
 * @email
 */
@TableName("yaofang")
public class YaofangEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YaofangEntity() {

	}

	public YaofangEntity(T t) {
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

    @Override
    public String toString() {
        return "Yaofang{" +
            "id=" + id +
            ", bingliId=" + bingliId +
            ", yaofangUuidNumber=" + yaofangUuidNumber +
            ", yaofangName=" + yaofangName +
            ", yaofangTypes=" + yaofangTypes +
            ", bingliFile=" + bingliFile +
            ", bingliContent=" + bingliContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
