package com.entity.model;

import com.entity.JiankangzixuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 健康资讯
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiankangzixuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 健康资讯名称
     */
    private String jiankangzixuName;


    /**
     * 健康资讯图片
     */
    private String jiankangzixuPhoto;


    /**
     * 健康资讯类型
     */
    private Integer jiankangzixuTypes;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 健康资讯详情
     */
    private String jiankangzixuContent;


    /**
     * 创建时间 show1 show2 nameShow
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
	 * 获取：健康资讯名称
	 */
    public String getJiankangzixuName() {
        return jiankangzixuName;
    }


    /**
	 * 设置：健康资讯名称
	 */
    public void setJiankangzixuName(String jiankangzixuName) {
        this.jiankangzixuName = jiankangzixuName;
    }
    /**
	 * 获取：健康资讯图片
	 */
    public String getJiankangzixuPhoto() {
        return jiankangzixuPhoto;
    }


    /**
	 * 设置：健康资讯图片
	 */
    public void setJiankangzixuPhoto(String jiankangzixuPhoto) {
        this.jiankangzixuPhoto = jiankangzixuPhoto;
    }
    /**
	 * 获取：健康资讯类型
	 */
    public Integer getJiankangzixuTypes() {
        return jiankangzixuTypes;
    }


    /**
	 * 设置：健康资讯类型
	 */
    public void setJiankangzixuTypes(Integer jiankangzixuTypes) {
        this.jiankangzixuTypes = jiankangzixuTypes;
    }
    /**
	 * 获取：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：发布时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：健康资讯详情
	 */
    public String getJiankangzixuContent() {
        return jiankangzixuContent;
    }


    /**
	 * 设置：健康资讯详情
	 */
    public void setJiankangzixuContent(String jiankangzixuContent) {
        this.jiankangzixuContent = jiankangzixuContent;
    }
    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
