package com.cl.dao;

import com.cl.entity.HuiyishixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.HuiyishixinxiView;


/**
 * 会议室信息
 * 
 * @author 
 * @email 
 * @date 2024-05-22 12:29:17
 */
public interface HuiyishixinxiDao extends BaseMapper<HuiyishixinxiEntity> {
	
	List<HuiyishixinxiView> selectListView(@Param("ew") Wrapper<HuiyishixinxiEntity> wrapper);

	List<HuiyishixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyishixinxiEntity> wrapper);
	
	HuiyishixinxiView selectView(@Param("ew") Wrapper<HuiyishixinxiEntity> wrapper);
	

}
