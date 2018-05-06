package com.firebird.ssm.mapper;

import com.firebird.ssm.po.ItemsCustom;
import com.firebird.ssm.po.ItemsQueryVo;

import java.util.List;

public interface ItemsMapperCustom {
    /*商品列表查询*/
     List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;

}