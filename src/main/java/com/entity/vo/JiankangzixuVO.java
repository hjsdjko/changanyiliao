package com.entity.vo;

import com.entity.JiankangzixuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 健康资讯
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jiankangzixu")
public class JiankangzixuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 健康资讯详情
     */

    @TableField(value = "jiankangzixu_content")
    private String jiankangzixuContent;


    /**
     * 创建时间 show1 show2 nameShow
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
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
