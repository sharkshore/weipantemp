package com.shark.weipan.dao;

import com.shark.weipan.common.dao.IBaseDao;
import com.shark.weipan.dto.CommissionHistory;
import com.shark.weipan.dto.CommissionHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommissionHistoryMapper extends IBaseDao {
    long countByExample(CommissionHistoryExample example);

    int deleteByExample(CommissionHistoryExample example);

    int deleteByPrimaryKey(String id);

    int insert(CommissionHistory record);

    int insertSelective(CommissionHistory record);

    List<CommissionHistory> selectByExample(CommissionHistoryExample example);

    CommissionHistory selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CommissionHistory record, @Param("example") CommissionHistoryExample example);

    int updateByExample(@Param("record") CommissionHistory record, @Param("example") CommissionHistoryExample example);

    int updateByPrimaryKeySelective(CommissionHistory record);

    int updateByPrimaryKey(CommissionHistory record);
}