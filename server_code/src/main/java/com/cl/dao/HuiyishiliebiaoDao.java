package com.cl.dao;

import com.cl.entity.HuiyishiliebiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.HuiyishiliebiaoView;


/**
 * 会议室列表
 * 
 * @author 
 * @email 
 * @date 2024-05-22 12:29:17
 */
public interface HuiyishiliebiaoDao extends BaseMapper<HuiyishiliebiaoEntity> {
	
	List<HuiyishiliebiaoView> selectListView(@Param("ew") Wrapper<HuiyishiliebiaoEntity> wrapper);

	List<HuiyishiliebiaoView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyishiliebiaoEntity> wrapper);
	
	HuiyishiliebiaoView selectView(@Param("ew") Wrapper<HuiyishiliebiaoEntity> wrapper);
	

}
