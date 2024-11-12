package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.HuiyiziliaoEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.HuiyiziliaoView;


/**
 * 会议资料
 *
 * @author 
 * @email 
 * @date 2024-05-22 12:29:17
 */
public interface HuiyiziliaoService extends IService<HuiyiziliaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyiziliaoView> selectListView(Wrapper<HuiyiziliaoEntity> wrapper);
   	
   	HuiyiziliaoView selectView(@Param("ew") Wrapper<HuiyiziliaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyiziliaoEntity> wrapper);
   	

}

