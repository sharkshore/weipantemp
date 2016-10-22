package com.shark.weipan.dao;

import com.shark.weipan.common.dao.IBaseDao;
import com.shark.weipan.dto.GoodsDetail;
import com.shark.weipan.dto.GoodsDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsDetailMapper extends IBaseDao {
    long countByExample(GoodsDetailExample example);

    int deleteByExample(GoodsDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsDetail record);

    int insertSelective(GoodsDetail record);

    List<GoodsDetail> selectByExample(GoodsDetailExample example);

    GoodsDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsDetail record, @Param("example") GoodsDetailExample example);

    int updateByExample(@Param("record") GoodsDetail record, @Param("example") GoodsDetailExample example);

    int updateByPrimaryKeySelective(GoodsDetail record);

    int updateByPrimaryKey(GoodsDetail record);
}