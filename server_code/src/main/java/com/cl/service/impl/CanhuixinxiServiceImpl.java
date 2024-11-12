package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.CanhuixinxiDao;
import com.cl.entity.CanhuixinxiEntity;
import com.cl.service.CanhuixinxiService;
import com.cl.entity.view.CanhuixinxiView;

@Service("canhuixinxiService")
public class CanhuixinxiServiceImpl extends ServiceImpl<CanhuixinxiDao, CanhuixinxiEntity> implements CanhuixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CanhuixinxiEntity> page = this.selectPage(
                new Query<CanhuixinxiEntity>(params).getPage(),
                new EntityWrapper<CanhuixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CanhuixinxiEntity> wrapper) {
		  Page<CanhuixinxiView> page =new Query<CanhuixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<CanhuixinxiView> selectListView(Wrapper<CanhuixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CanhuixinxiView selectView(Wrapper<CanhuixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
