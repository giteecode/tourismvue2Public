package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszuixinxianluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszuixinxianluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszuixinxianluView;


/**
 * 最新线路评论表
 *
 * @author 
 * @email 
 * @date 2021-03-03 15:14:00
 */
public interface DiscusszuixinxianluService extends IService<DiscusszuixinxianluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszuixinxianluVO> selectListVO(Wrapper<DiscusszuixinxianluEntity> wrapper);
   	
   	DiscusszuixinxianluVO selectVO(@Param("ew") Wrapper<DiscusszuixinxianluEntity> wrapper);
   	
   	List<DiscusszuixinxianluView> selectListView(Wrapper<DiscusszuixinxianluEntity> wrapper);
   	
   	DiscusszuixinxianluView selectView(@Param("ew") Wrapper<DiscusszuixinxianluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszuixinxianluEntity> wrapper);
   	
}

