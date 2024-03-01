package com.entity.view;

import com.entity.DiscusszuixinxianluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 最新线路评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-03 15:14:00
 */
@TableName("discusszuixinxianlu")
public class DiscusszuixinxianluView  extends DiscusszuixinxianluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusszuixinxianluView(){
	}
 
 	public DiscusszuixinxianluView(DiscusszuixinxianluEntity discusszuixinxianluEntity){
 	try {
			BeanUtils.copyProperties(this, discusszuixinxianluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
