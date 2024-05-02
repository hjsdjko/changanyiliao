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
 * 健康资讯
 *
 * @author 
 * @email
 */
@TableName("jiankangzixu")
public class JiankangzixuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiankangzixuEntity() {

	}

	public JiankangzixuEntity(T t) {
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
     * 健康资讯名称
     */
    @TableField(value = "jiankangzixu_name")

    private String jiankangzixuName;


    /**
     * 健康资讯图片
     */
    @TableField(value = "jiankangzixu_photo")

    private String jiankangzixuPhoto;


    /**
     * 健康资讯类型
     */
    @TableField(value = "jiankangzixu_types")

    private Integer jiankangzixuTypes;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 健康资讯详情
     */
    @TableField(value = "jiankangzixu_content")

    private String jiankangzixuContent;


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
	 * 设置：健康资讯名称
	 */
    public String getJiankangzixuName() {
        return jiankangzixuName;
    }


    /**
	 * 获取：健康资讯名称
	 */

    public void setJiankangzixuName(String jiankangzixuName) {
        this.jiankangzixuName = jiankangzixuName;
    }
    /**
	 * 设置：健康资讯图片
	 */
    public String getJiankangzixuPhoto() {
        return jiankangzixuPhoto;
    }


    /**
	 * 获取：健康资讯图片
	 */

    public void setJiankangzixuPhoto(String jiankangzixuPhoto) {
        this.jiankangzixuPhoto = jiankangzixuPhoto;
    }
    /**
	 * 设置：健康资讯类型
	 */
    public Integer getJiankangzixuTypes() {
        return jiankangzixuTypes;
    }


    /**
	 * 获取：健康资讯类型
	 */

    public void setJiankangzixuTypes(Integer jiankangzixuTypes) {
        this.jiankangzixuTypes = jiankangzixuTypes;
    }
    /**
	 * 设置：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：健康资讯详情
	 */
    public String getJiankangzixuContent() {
        return jiankangzixuContent;
    }


    /**
	 * 获取：健康资讯详情
	 */

    public void setJiankangzixuContent(String jiankangzixuContent) {
        this.jiankangzixuContent = jiankangzixuContent;
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
        return "Jiankangzixu{" +
            "id=" + id +
            ", jiankangzixuName=" + jiankangzixuName +
            ", jiankangzixuPhoto=" + jiankangzixuPhoto +
            ", jiankangzixuTypes=" + jiankangzixuTypes +
            ", insertTime=" + insertTime +
            ", jiankangzixuContent=" + jiankangzixuContent +
            ", createTime=" + createTime +
        "}";
    }
}
