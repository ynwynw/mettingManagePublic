package com.cl.dao;

import com.cl.entity.CanhuixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.CanhuixinxiView;


/**
 * 参会信息
 * 
 * @author 
 * @email 
 * @date 2024-05-22 12:29:17
 */
public interface CanhuixinxiDao extends BaseMapper<CanhuixinxiEntity> {
	
	List<CanhuixinxiView> selectListView(@Param("ew") Wrapper<CanhuixinxiEntity> wrapper);

	List<CanhuixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<CanhuixinxiEntity> wrapper);
	
	CanhuixinxiView selectView(@Param("ew") Wrapper<CanhuixinxiEntity> wrapper);
	

}
