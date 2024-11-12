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


import com.cl.dao.HuiyitixingDao;
import com.cl.entity.HuiyitixingEntity;
import com.cl.service.HuiyitixingService;
import com.cl.entity.view.HuiyitixingView;

@Service("huiyitixingService")
public class HuiyitixingServiceImpl extends ServiceImpl<HuiyitixingDao, HuiyitixingEntity> implements HuiyitixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyitixingEntity> page = this.selectPage(
                new Query<HuiyitixingEntity>(params).getPage(),
                new EntityWrapper<HuiyitixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyitixingEntity> wrapper) {
		  Page<HuiyitixingView> page =new Query<HuiyitixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<HuiyitixingView> selectListView(Wrapper<HuiyitixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyitixingView selectView(Wrapper<HuiyitixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
