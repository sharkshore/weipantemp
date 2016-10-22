package com.shark.weipan.dao;

import com.shark.weipan.common.dao.IBaseDao;
import com.shark.weipan.dto.Menu;
import com.shark.weipan.dto.MenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenuMapper extends IBaseDao {
    long countByExample(MenuExample example);

    int deleteByExample(MenuExample example);

    int deleteByPrimaryKey(Integer menuId);

    int insert(Menu record);

    int insertSelective(Menu record);

    List<Menu> selectByExample(MenuExample example);

    Menu selectByPrimaryKey(Integer menuId);

    int updateByExampleSelective(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByExample(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
}