package com.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.entity.YishengLiuyanEntity;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

/**
 * 医生留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("yisheng_liuyan")
public class YishengLiuyanView extends YishengLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 yisheng
			/**
			* 医生姓名
			*/
			private String yishengName;
			/**
			* 医生手机号
			*/
			private String yishengPhone;
			/**
			* 医生头像
			*/
			private String yishengPhoto;
			/**
			* 医生邮箱
			*/
			private String yishengEmail;
			/**
			* 科室
			*/
			private Integer keshiTypes;
				/**
				* 科室的值
				*/
				private String keshiValue;
			/**
			* 职位
			*/
			private Integer zhiweiTypes;
				/**
				* 职位的值
				*/
				private String zhiweiValue;
			/**
			* 是否坐诊
			*/
			private Integer zuozhenTypes;
				/**
				* 是否坐诊的值
				*/
				private String zuozhenValue;
			/**
			* 医生详情
			*/
			private String yishengContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 用户邮箱
			*/
			private String yonghuEmail;
			/**
			* 余额
			*/
			private Double newMoney;

	public YishengLiuyanView() {

	}

	public YishengLiuyanView(YishengLiuyanEntity yishengLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, yishengLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}











































				//级联表的get和set yisheng
					/**
					* 获取： 医生姓名
					*/
					public String getYishengName() {
						return yishengName;
					}
					/**
					* 设置： 医生姓名
					*/
					public void setYishengName(String yishengName) {
						this.yishengName = yishengName;
					}
					/**
					* 获取： 医生手机号
					*/
					public String getYishengPhone() {
						return yishengPhone;
					}
					/**
					* 设置： 医生手机号
					*/
					public void setYishengPhone(String yishengPhone) {
						this.yishengPhone = yishengPhone;
					}
					/**
					* 获取： 医生头像
					*/
					public String getYishengPhoto() {
						return yishengPhoto;
					}
					/**
					* 设置： 医生头像
					*/
					public void setYishengPhoto(String yishengPhoto) {
						this.yishengPhoto = yishengPhoto;
					}
					/**
					* 获取： 医生邮箱
					*/
					public String getYishengEmail() {
						return yishengEmail;
					}
					/**
					* 设置： 医生邮箱
					*/
					public void setYishengEmail(String yishengEmail) {
						this.yishengEmail = yishengEmail;
					}
					/**
					* 获取： 科室
					*/
					public Integer getKeshiTypes() {
						return keshiTypes;
					}
					/**
					* 设置： 科室
					*/
					public void setKeshiTypes(Integer keshiTypes) {
						this.keshiTypes = keshiTypes;
					}


						/**
						* 获取： 科室的值
						*/
						public String getKeshiValue() {
							return keshiValue;
						}
						/**
						* 设置： 科室的值
						*/
						public void setKeshiValue(String keshiValue) {
							this.keshiValue = keshiValue;
						}
					/**
					* 获取： 职位
					*/
					public Integer getZhiweiTypes() {
						return zhiweiTypes;
					}
					/**
					* 设置： 职位
					*/
					public void setZhiweiTypes(Integer zhiweiTypes) {
						this.zhiweiTypes = zhiweiTypes;
					}


						/**
						* 获取： 职位的值
						*/
						public String getZhiweiValue() {
							return zhiweiValue;
						}
						/**
						* 设置： 职位的值
						*/
						public void setZhiweiValue(String zhiweiValue) {
							this.zhiweiValue = zhiweiValue;
						}
					/**
					* 获取： 是否坐诊
					*/
					public Integer getZuozhenTypes() {
						return zuozhenTypes;
					}
					/**
					* 设置： 是否坐诊
					*/
					public void setZuozhenTypes(Integer zuozhenTypes) {
						this.zuozhenTypes = zuozhenTypes;
					}


						/**
						* 获取： 是否坐诊的值
						*/
						public String getZuozhenValue() {
							return zuozhenValue;
						}
						/**
						* 设置： 是否坐诊的值
						*/
						public void setZuozhenValue(String zuozhenValue) {
							this.zuozhenValue = zuozhenValue;
						}
					/**
					* 获取： 医生详情
					*/
					public String getYishengContent() {
						return yishengContent;
					}
					/**
					* 设置： 医生详情
					*/
					public void setYishengContent(String yishengContent) {
						this.yishengContent = yishengContent;
					}










				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 用户邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 用户邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}






}
