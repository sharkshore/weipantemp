package com.shark.weipan.dao;

import com.shark.weipan.common.dao.IBaseDao;
import com.shark.weipan.dto.RechargeApprove;
import com.shark.weipan.dto.RechargeApproveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RechargeApproveMapper extends IBaseDao {
    long countByExample(RechargeApproveExample example);

    int deleteByExample(RechargeApproveExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RechargeApprove record);

    int insertSelective(RechargeApprove record);

    List<RechargeApprove> selectByExample(RechargeApproveExample example);

    RechargeApprove selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RechargeApprove record, @Param("example") RechargeApproveExample example);

    int updateByExample(@Param("record") RechargeApprove record, @Param("example") RechargeApproveExample example);

    int updateByPrimaryKeySelective(RechargeApprove record);

    int updateByPrimaryKey(RechargeApprove record);
}