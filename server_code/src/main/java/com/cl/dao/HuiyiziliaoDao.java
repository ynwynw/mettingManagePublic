package com.cl.dao;

import com.cl.entity.HuiyiziliaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.HuiyiziliaoView;


/**
 * 会议资料
 * 
 * @author 
 * @email 
 * @date 2024-05-22 12:29:17
 */
public interface HuiyiziliaoDao extends BaseMapper<HuiyiziliaoEntity> {
	
	List<HuiyiziliaoView> selectListView(@Param("ew") Wrapper<HuiyiziliaoEntity> wrapper);

	List<HuiyiziliaoView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyiziliaoEntity> wrapper);
	
	HuiyiziliaoView selectView(@Param("ew") Wrapper<HuiyiziliaoEntity> wrapper);
	

}
