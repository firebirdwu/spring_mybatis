package com.firebird.ssm.mapper;

import com.firebird.ssm.po.Items;
import com.firebird.ssm.po.ItemsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemsMapper {

    int countByExample(ItemsExample example);


    int deleteByExample(ItemsExample example);


    int deletebyprideleteByPrimaryKey(Integer id);


    int insert(Items record);


    int insertSelective(Items record);


    List<Items> selectByExampleWithBLOBs(ItemsExample example);


    List<Items> selectByExample(ItemsExample example);


    Items selectByPrimaryKey(Integer id);


    int updateByExampleSelective(@Param("record") Items record, @Param("example") ItemsExample example);


    int updateByExampleWithBLOBs(@Param("record") Items record, @Param("example") ItemsExample example);


    int updateByExample(@Param("record") Items record, @Param("example") ItemsExample example);

    int updateByPrimaryKeySelective(Items record);

    int updateByPrimaryKeyWithBLOBs(Items record);

    int updateByPrimaryKey(Items record);
}