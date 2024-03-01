package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.LvyouxianluDao;
import com.entity.LvyouxianluEntity;
import com.service.LvyouxianluService;
import com.entity.vo.LvyouxianluVO;
import com.entity.view.LvyouxianluView;

@Service("lvyouxianluService")
public class LvyouxianluServiceImpl extends ServiceImpl<LvyouxianluDao, LvyouxianluEntity> implements LvyouxianluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LvyouxianluEntity> page = this.selectPage(
                new Query<LvyouxianluEntity>(params).getPage(),
                new EntityWrapper<LvyouxianluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LvyouxianluEntity> wrapper) {
		  Page<LvyouxianluView> page =new Query<LvyouxianluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LvyouxianluVO> selectListVO(Wrapper<LvyouxianluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LvyouxianluVO selectVO(Wrapper<LvyouxianluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LvyouxianluView> selectListView(Wrapper<LvyouxianluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LvyouxianluView selectView(Wrapper<LvyouxianluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
