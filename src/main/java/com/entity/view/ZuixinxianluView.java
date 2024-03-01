package com.entity.view;

import com.entity.ZuixinxianluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 最新线路
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-03 15:13:59
 */
@TableName("zuixinxianlu")
public class ZuixinxianluView  extends ZuixinxianluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZuixinxianluView(){
	}
 
 	public ZuixinxianluView(ZuixinxianluEntity zuixinxianluEntity){
 	try {
			BeanUtils.copyProperties(this, zuixinxianluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
