package com.shark.weipan.dao;

import com.shark.weipan.common.dao.IBaseDao;
import com.shark.weipan.dto.RechargeCashHistory;
import com.shark.weipan.dto.RechargeCashHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RechargeCashHistoryMapper extends IBaseDao {
    long countByExample(RechargeCashHistoryExample example);

    int deleteByExample(RechargeCashHistoryExample example);

    int deleteByPrimaryKey(String id);

    int insert(RechargeCashHistory record);

    int insertSelective(RechargeCashHistory record);

    List<RechargeCashHistory> selectByExample(RechargeCashHistoryExample example);

    RechargeCashHistory selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RechargeCashHistory record, @Param("example") RechargeCashHistoryExample example);

    int updateByExample(@Param("record") RechargeCashHistory record, @Param("example") RechargeCashHistoryExample example);

    int updateByPrimaryKeySelective(RechargeCashHistory record);

    int updateByPrimaryKey(RechargeCashHistory record);
}