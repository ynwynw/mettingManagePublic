package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.HuiyishixinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.HuiyishixinxiView;


/**
 * 会议室信息
 *
 * @author 
 * @email 
 * @date 2024-05-22 12:29:17
 */
public interface HuiyishixinxiService extends IService<HuiyishixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyishixinxiView> selectListView(Wrapper<HuiyishixinxiEntity> wrapper);
   	
   	HuiyishixinxiView selectView(@Param("ew") Wrapper<HuiyishixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyishixinxiEntity> wrapper);
   	

}

