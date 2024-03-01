package com.entity.view;

import com.entity.XianlufenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 线路分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-03 15:13:59
 */
@TableName("xianlufenlei")
public class XianlufenleiView  extends XianlufenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XianlufenleiView(){
	}
 
 	public XianlufenleiView(XianlufenleiEntity xianlufenleiEntity){
 	try {
			BeanUtils.copyProperties(this, xianlufenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
