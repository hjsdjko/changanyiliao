package com.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.entity.ShangpinCollectionEntity;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

/**
 * 药品收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shangpin_collection")
public class ShangpinCollectionView extends ShangpinCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String shangpinCollectionValue;



		//级联表 shangpin
			/**
			* 药品名称
			*/
			private String shangpinName;
			/**
			* 药品照片
			*/
			private String shangpinPhoto;
			/**
			* 药品类型
			*/
			private Integer shangpinTypes;
				/**
				* 药品类型的值
				*/
				private String shangpinValue;
			/**
			* 药品库存
			*/
			private Integer shangpinKucunNumber;
			/**
			* 药品原价
			*/
			private Double shangpinOldMoney;
			/**
			* 现价/积分
			*/
			private Double shangpinNewMoney;
			/**
			* 点击次数
			*/
			private Integer shangpinClicknum;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer shangpinDelete;
			/**
			* 药品简介
			*/
			private String shangpinContent;

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

	public ShangpinCollectionView() {

	}

	public ShangpinCollectionView(ShangpinCollectionEntity shangpinCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, shangpinCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getShangpinCollectionValue() {
				return shangpinCollectionValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setShangpinCollectionValue(String shangpinCollectionValue) {
				this.shangpinCollectionValue = shangpinCollectionValue;
			}

























				//级联表的get和set shangpin
					/**
					* 获取： 药品名称
					*/
					public String getShangpinName() {
						return shangpinName;
					}
					/**
					* 设置： 药品名称
					*/
					public void setShangpinName(String shangpinName) {
						this.shangpinName = shangpinName;
					}
					/**
					* 获取： 药品照片
					*/
					public String getShangpinPhoto() {
						return shangpinPhoto;
					}
					/**
					* 设置： 药品照片
					*/
					public void setShangpinPhoto(String shangpinPhoto) {
						this.shangpinPhoto = shangpinPhoto;
					}
					/**
					* 获取： 药品类型
					*/
					public Integer getShangpinTypes() {
						return shangpinTypes;
					}
					/**
					* 设置： 药品类型
					*/
					public void setShangpinTypes(Integer shangpinTypes) {
						this.shangpinTypes = shangpinTypes;
					}


						/**
						* 获取： 药品类型的值
						*/
						public String getShangpinValue() {
							return shangpinValue;
						}
						/**
						* 设置： 药品类型的值
						*/
						public void setShangpinValue(String shangpinValue) {
							this.shangpinValue = shangpinValue;
						}
					/**
					* 获取： 药品库存
					*/
					public Integer getShangpinKucunNumber() {
						return shangpinKucunNumber;
					}
					/**
					* 设置： 药品库存
					*/
					public void setShangpinKucunNumber(Integer shangpinKucunNumber) {
						this.shangpinKucunNumber = shangpinKucunNumber;
					}
					/**
					* 获取： 药品原价
					*/
					public Double getShangpinOldMoney() {
						return shangpinOldMoney;
					}
					/**
					* 设置： 药品原价
					*/
					public void setShangpinOldMoney(Double shangpinOldMoney) {
						this.shangpinOldMoney = shangpinOldMoney;
					}
					/**
					* 获取： 现价/积分
					*/
					public Double getShangpinNewMoney() {
						return shangpinNewMoney;
					}
					/**
					* 设置： 现价/积分
					*/
					public void setShangpinNewMoney(Double shangpinNewMoney) {
						this.shangpinNewMoney = shangpinNewMoney;
					}
					/**
					* 获取： 点击次数
					*/
					public Integer getShangpinClicknum() {
						return shangpinClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setShangpinClicknum(Integer shangpinClicknum) {
						this.shangpinClicknum = shangpinClicknum;
					}
					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否上架的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否上架的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}
					/**
					* 获取： 逻辑删除
					*/
					public Integer getShangpinDelete() {
						return shangpinDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setShangpinDelete(Integer shangpinDelete) {
						this.shangpinDelete = shangpinDelete;
					}
					/**
					* 获取： 药品简介
					*/
					public String getShangpinContent() {
						return shangpinContent;
					}
					/**
					* 设置： 药品简介
					*/
					public void setShangpinContent(String shangpinContent) {
						this.shangpinContent = shangpinContent;
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
