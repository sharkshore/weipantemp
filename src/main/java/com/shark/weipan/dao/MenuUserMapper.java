package com.shark.weipan.dao;

import com.shark.weipan.common.dao.IBaseDao;
import com.shark.weipan.dto.MenuUser;
import com.shark.weipan.dto.MenuUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenuUserMapper extends IBaseDao {
    long countByExample(MenuUserExample example);

    int deleteByExample(MenuUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MenuUser record);

    int insertSelective(MenuUser record);

    List<MenuUser> selectByExample(MenuUserExample example);

    MenuUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MenuUser record, @Param("example") MenuUserExample example);

    int updateByExample(@Param("record") MenuUser record, @Param("example") MenuUserExample example);

    int updateByPrimaryKeySelective(MenuUser record);

    int updateByPrimaryKey(MenuUser record);
}