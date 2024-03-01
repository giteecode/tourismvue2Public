package com.entity.view;

import com.entity.DiscusslvyouxianluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 旅游线路评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-03 15:14:00
 */
@TableName("discusslvyouxianlu")
public class DiscusslvyouxianluView  extends DiscusslvyouxianluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusslvyouxianluView(){
	}
 
 	public DiscusslvyouxianluView(DiscusslvyouxianluEntity discusslvyouxianluEntity){
 	try {
			BeanUtils.copyProperties(this, discusslvyouxianluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
