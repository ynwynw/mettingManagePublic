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


import com.cl.dao.HuiyishixinxiDao;
import com.cl.entity.HuiyishixinxiEntity;
import com.cl.service.HuiyishixinxiService;
import com.cl.entity.view.HuiyishixinxiView;

@Service("huiyishixinxiService")
public class HuiyishixinxiServiceImpl extends ServiceImpl<HuiyishixinxiDao, HuiyishixinxiEntity> implements HuiyishixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyishixinxiEntity> page = this.selectPage(
                new Query<HuiyishixinxiEntity>(params).getPage(),
                new EntityWrapper<HuiyishixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyishixinxiEntity> wrapper) {
		  Page<HuiyishixinxiView> page =new Query<HuiyishixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<HuiyishixinxiView> selectListView(Wrapper<HuiyishixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyishixinxiView selectView(Wrapper<HuiyishixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
