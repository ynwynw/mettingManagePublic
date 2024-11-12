package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.CanhuixinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.CanhuixinxiView;


/**
 * 参会信息
 *
 * @author 
 * @email 
 * @date 2024-05-22 12:29:17
 */
public interface CanhuixinxiService extends IService<CanhuixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CanhuixinxiView> selectListView(Wrapper<CanhuixinxiEntity> wrapper);
   	
   	CanhuixinxiView selectView(@Param("ew") Wrapper<CanhuixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CanhuixinxiEntity> wrapper);
   	

}

