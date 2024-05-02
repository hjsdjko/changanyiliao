package com.dao;

import com.entity.YuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YuyueView;

/**
 * 医生预约 Dao 接口
 *
 * @author 
 */
public interface YuyueDao extends BaseMapper<YuyueEntity> {

   List<YuyueView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
