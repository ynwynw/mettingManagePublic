package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.HuiyishiliebiaoEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.HuiyishiliebiaoView;


/**
 * 会议室列表
 *
 * @author 
 * @email 
 * @date 2024-05-22 12:29:17
 */
public interface HuiyishiliebiaoService extends IService<HuiyishiliebiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyishiliebiaoView> selectListView(Wrapper<HuiyishiliebiaoEntity> wrapper);
   	
   	HuiyishiliebiaoView selectView(@Param("ew") Wrapper<HuiyishiliebiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyishiliebiaoEntity> wrapper);
   	

}

