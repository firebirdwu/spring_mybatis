package com.firebird.ssm.controller;

import com.firebird.ssm.po.ItemsCustom;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JsonTest {
    //请求json，返回json
    @RequestMapping("/requestJson")
    public @ResponseBody ItemsCustom requestJson(@RequestBody ItemsCustom itemsCustom){
        return itemsCustom;
    }

    @RequestMapping("/responseJson")
    public @ResponseBody ItemsCustom responseJson(ItemsCustom itemsCustom){
        return itemsCustom;
    }
}
