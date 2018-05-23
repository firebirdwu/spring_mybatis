package com.firebird.ssm.service.impl;

import com.firebird.ssm.controller.exception.CustomException;
import com.firebird.ssm.mapper.ItemsMapper;
import com.firebird.ssm.mapper.ItemsMapperCustom;
import com.firebird.ssm.po.Items;
import com.firebird.ssm.po.ItemsCustom;
import com.firebird.ssm.po.ItemsQueryVo;
import com.firebird.ssm.service.ItemsService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 商品管理
 * Created by firebird on 2018/5/5.
 */
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsMapperCustom itemsMapperCustom;

    @Autowired
    private ItemsMapper itemsMapper;

    @Override
    public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception {
        return itemsMapperCustom.findItemsList(itemsQueryVo);
    }

    @Override
    public ItemsCustom findItemsById(Integer id) throws Exception {
        Items items = itemsMapper.selectByPrimaryKey(id);
        if(items == null){
            throw new CustomException("商品信息不存在.");
        }
        ItemsCustom itemsCustom = null;
        if (items != null) {
            itemsCustom = new ItemsCustom();
            BeanUtils.copyProperties(items, itemsCustom);
        }
        return itemsCustom;
    }

    @Override
    public void updateItems(Integer id, ItemsCustom itemsCustom) throws Exception {
        itemsCustom.setId(id);
        itemsMapper.updateByPrimaryKeyWithBLOBs(itemsCustom);
    }

    @Override
    public void deleteItems(Integer[] itemsId) throws Exception {

    }
}
