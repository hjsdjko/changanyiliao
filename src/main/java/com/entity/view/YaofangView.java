package com.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.entity.YaofangEntity;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

/**
 * 药方
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("yaofang")
public class YaofangView extends YaofangEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 药方类型的值
		*/
		private String yaofangValue;



		//级联表 bingli
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

	public YaofangView() {

	}

	public YaofangView(YaofangEntity yaofangEntity) {
		try {
			BeanUtils.copyProperties(this, yaofangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 药方类型的值
			*/
			public String getYaofangValue() {
				return yaofangValue;
			}
			/**
			* 设置： 药方类型的值
			*/
			public void setYaofangValue(String yaofangValue) {
				this.yaofangValue = yaofangValue;
			}






				//级联表的get和set bingli
					/**
					* 获取： 病例编号
					*/
					public String getBingliUuidNumber() {
						return bingliUuidNumber;
					}
					/**
					* 设置： 病例编号
					*/
					public void setBingliUuidNumber(String bingliUuidNumber) {
						this.bingliUuidNumber = bingliUuidNumber;
					}
					/**
					* 获取： 患者姓名
					*/
					public String getBingliName() {
						return bingliName;
					}
					/**
					* 设置： 患者姓名
					*/
					public void setBingliName(String bingliName) {
						this.bingliName = bingliName;
					}
					/**
					* 获取： 患者手机号
					*/
					public String getHuanzhePhone() {
						return huanzhePhone;
					}
					/**
					* 设置： 患者手机号
					*/
					public void setHuanzhePhone(String huanzhePhone) {
						this.huanzhePhone = huanzhePhone;
					}
					/**
					* 获取： 患者身份证号
					*/
					public String getHuanzheIdNumber() {
						return huanzheIdNumber;
					}
					/**
					* 设置： 患者身份证号
					*/
					public void setHuanzheIdNumber(String huanzheIdNumber) {
						this.huanzheIdNumber = huanzheIdNumber;
					}
					/**
					* 获取： 病例文件
					*/
					public String getBingliFile() {
						return bingliFile;
					}
					/**
					* 设置： 病例文件
					*/
					public void setBingliFile(String bingliFile) {
						this.bingliFile = bingliFile;
					}
					/**
					* 获取： 病例备注
					*/
					public String getBingliContent() {
						return bingliContent;
					}
					/**
					* 设置： 病例备注
					*/
					public void setBingliContent(String bingliContent) {
						this.bingliContent = bingliContent;
					}
































}
