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


import com.cl.dao.HuiyishiliebiaoDao;
import com.cl.entity.HuiyishiliebiaoEntity;
import com.cl.service.HuiyishiliebiaoService;
import com.cl.entity.view.HuiyishiliebiaoView;

@Service("huiyishiliebiaoService")
public class HuiyishiliebiaoServiceImpl extends ServiceImpl<HuiyishiliebiaoDao, HuiyishiliebiaoEntity> implements HuiyishiliebiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyishiliebiaoEntity> page = this.selectPage(
                new Query<HuiyishiliebiaoEntity>(params).getPage(),
                new EntityWrapper<HuiyishiliebiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyishiliebiaoEntity> wrapper) {
		  Page<HuiyishiliebiaoView> page =new Query<HuiyishiliebiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<HuiyishiliebiaoView> selectListView(Wrapper<HuiyishiliebiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyishiliebiaoView selectView(Wrapper<HuiyishiliebiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
