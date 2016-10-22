package com.shark.weipan.dao;

import com.shark.weipan.common.dao.IBaseDao;
import com.shark.weipan.dto.AgentApprove;
import com.shark.weipan.dto.AgentApproveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AgentApproveMapper extends IBaseDao {
    long countByExample(AgentApproveExample example);

    int deleteByExample(AgentApproveExample example);

    int deleteByPrimaryKey(Integer approveId);

    int insert(AgentApprove record);

    int insertSelective(AgentApprove record);

    List<AgentApprove> selectByExample(AgentApproveExample example);

    AgentApprove selectByPrimaryKey(Integer approveId);

    int updateByExampleSelective(@Param("record") AgentApprove record, @Param("example") AgentApproveExample example);

    int updateByExample(@Param("record") AgentApprove record, @Param("example") AgentApproveExample example);

    int updateByPrimaryKeySelective(AgentApprove record);

    int updateByPrimaryKey(AgentApprove record);
}