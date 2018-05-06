package com.firebird.ssm.controller;

import com.firebird.ssm.po.ItemsCustom;
import com.firebird.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by firebird on 2018/5/5.
 * items商品信息
 */

@Controller
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping(value = "/queryItems")
    public ModelAndView queryItems() throws Exception {
        List<ItemsCustom> itemsList = itemsService.findItemsList(null);

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("itemsList", itemsList);

        modelAndView.setViewName("items/itemsList");

        return modelAndView;
    }


    @RequestMapping(value = "/editItems")
    public String editItems(Model model, @RequestParam(value = "id") Integer id) throws Exception {

        ItemsCustom itemsCustom = itemsService.findItemsById(id);

        model.addAttribute("itemsCustom", itemsCustom);

        return "items/editItems";
    }

    @RequestMapping(value = "/editItemsSubmit")
    public String editItemsSubmit(Integer id ,ItemsCustom itemsCustom
                                  ) throws  Exception {
        itemsService.updateItems(id,itemsCustom);
        return  "success";
    }
}
