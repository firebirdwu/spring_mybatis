package com.firebird.ssm.service;

import com.firebird.ssm.po.ItemsCustom;
import com.firebird.ssm.po.ItemsQueryVo;

import java.util.List;

/**
 * Created by firebird on 2018/5/5.
 */
public interface ItemsService {
    //商品查询列表
    List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;

    //根据ID查询商品信息

    ItemsCustom findItemsById(Integer id) throws  Exception;

    //修改商品信息
     void updateItems(Integer id,ItemsCustom itemsCustom) throws  Exception;

     void deleteItems(Integer[] itemsId) throws  Exception;
}
