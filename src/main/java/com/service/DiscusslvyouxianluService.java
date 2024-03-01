package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusslvyouxianluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusslvyouxianluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusslvyouxianluView;


/**
 * 旅游线路评论表
 *
 * @author 
 * @email 
 * @date 2021-03-03 15:14:00
 */
public interface DiscusslvyouxianluService extends IService<DiscusslvyouxianluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusslvyouxianluVO> selectListVO(Wrapper<DiscusslvyouxianluEntity> wrapper);
   	
   	DiscusslvyouxianluVO selectVO(@Param("ew") Wrapper<DiscusslvyouxianluEntity> wrapper);
   	
   	List<DiscusslvyouxianluView> selectListView(Wrapper<DiscusslvyouxianluEntity> wrapper);
   	
   	DiscusslvyouxianluView selectView(@Param("ew") Wrapper<DiscusslvyouxianluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusslvyouxianluEntity> wrapper);
   	
}

