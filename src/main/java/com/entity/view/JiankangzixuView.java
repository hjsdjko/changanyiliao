package com.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.entity.JiankangzixuEntity;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

/**
 * 健康资讯
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jiankangzixu")
public class JiankangzixuView extends JiankangzixuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 健康资讯类型的值
		*/
		private String jiankangzixuValue;



	public JiankangzixuView() {

	}

	public JiankangzixuView(JiankangzixuEntity jiankangzixuEntity) {
		try {
			BeanUtils.copyProperties(this, jiankangzixuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 健康资讯类型的值
			*/
			public String getJiankangzixuValue() {
				return jiankangzixuValue;
			}
			/**
			* 设置： 健康资讯类型的值
			*/
			public void setJiankangzixuValue(String jiankangzixuValue) {
				this.jiankangzixuValue = jiankangzixuValue;
			}




















}
