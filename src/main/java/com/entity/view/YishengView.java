package com.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.entity.YishengEntity;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

/**
 * 医生
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("yisheng")
public class YishengView extends YishengEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 性别的值
		*/
		private String sexValue;
		/**
		* 科室的值
		*/
		private String keshiValue;
		/**
		* 职位的值
		*/
		private String zhiweiValue;
		/**
		* 是否坐诊的值
		*/
		private String zuozhenValue;



	public YishengView() {

	}

	public YishengView(YishengEntity yishengEntity) {
		try {
			BeanUtils.copyProperties(this, yishengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 性别的值
			*/
			public String getSexValue() {
				return sexValue;
			}
			/**
			* 设置： 性别的值
			*/
			public void setSexValue(String sexValue) {
				this.sexValue = sexValue;
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




















}
