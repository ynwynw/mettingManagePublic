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


import com.cl.dao.HuiyiziliaoDao;
import com.cl.entity.HuiyiziliaoEntity;
import com.cl.service.HuiyiziliaoService;
import com.cl.entity.view.HuiyiziliaoView;

@Service("huiyiziliaoService")
public class HuiyiziliaoServiceImpl extends ServiceImpl<HuiyiziliaoDao, HuiyiziliaoEntity> implements HuiyiziliaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyiziliaoEntity> page = this.selectPage(
                new Query<HuiyiziliaoEntity>(params).getPage(),
                new EntityWrapper<HuiyiziliaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyiziliaoEntity> wrapper) {
		  Page<HuiyiziliaoView> page =new Query<HuiyiziliaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<HuiyiziliaoView> selectListView(Wrapper<HuiyiziliaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyiziliaoView selectView(Wrapper<HuiyiziliaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
