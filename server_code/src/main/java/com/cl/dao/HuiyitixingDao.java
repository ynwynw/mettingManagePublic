package com.cl.dao;

import com.cl.entity.HuiyitixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.HuiyitixingView;


/**
 * 会议提醒
 * 
 * @author 
 * @email 
 * @date 2024-05-22 12:29:17
 */
public interface HuiyitixingDao extends BaseMapper<HuiyitixingEntity> {
	
	List<HuiyitixingView> selectListView(@Param("ew") Wrapper<HuiyitixingEntity> wrapper);

	List<HuiyitixingView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyitixingEntity> wrapper);
	
	HuiyitixingView selectView(@Param("ew") Wrapper<HuiyitixingEntity> wrapper);
	

}
