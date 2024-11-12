package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.HuiyitixingEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.HuiyitixingView;


/**
 * 会议提醒
 *
 * @author 
 * @email 
 * @date 2024-05-22 12:29:17
 */
public interface HuiyitixingService extends IService<HuiyitixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyitixingView> selectListView(Wrapper<HuiyitixingEntity> wrapper);
   	
   	HuiyitixingView selectView(@Param("ew") Wrapper<HuiyitixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyitixingEntity> wrapper);
   	

}

