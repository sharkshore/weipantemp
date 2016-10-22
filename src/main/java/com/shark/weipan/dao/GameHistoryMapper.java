package com.shark.weipan.dao;

import com.shark.weipan.common.dao.IBaseDao;
import com.shark.weipan.dto.GameHistory;
import com.shark.weipan.dto.GameHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameHistoryMapper extends IBaseDao {
    long countByExample(GameHistoryExample example);

    int deleteByExample(GameHistoryExample example);

    int deleteByPrimaryKey(String id);

    int insert(GameHistory record);

    int insertSelective(GameHistory record);

    List<GameHistory> selectByExample(GameHistoryExample example);

    GameHistory selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GameHistory record, @Param("example") GameHistoryExample example);

    int updateByExample(@Param("record") GameHistory record, @Param("example") GameHistoryExample example);

    int updateByPrimaryKeySelective(GameHistory record);

    int updateByPrimaryKey(GameHistory record);
}