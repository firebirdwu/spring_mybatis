package com.firebird.ssm.po;

/**
 * Created by firebird on 2018/5/5.
 */
public class ItemsQueryVo {
    private  Items items;

    private  ItemsCustom itemsCustom;

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public ItemsCustom getItemscustom() {
        return itemsCustom;
    }

    public void setItemscustom(ItemsCustom itemscustom) {
        this.itemsCustom = itemscustom;
    }
}
