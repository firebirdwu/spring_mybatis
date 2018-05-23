package com.firebird.ssm.controller;

import com.firebird.ssm.controller.exception.CustomException;
import com.firebird.ssm.controller.validation.ValidationGroup1;
import com.firebird.ssm.po.ItemsCustom;
import com.firebird.ssm.po.ItemsQueryVo;
import com.firebird.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Created by firebird on 2018/5/5.
 * items商品信息
 */

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @ModelAttribute(value = "itemTypes")
    public Map<String, String> getItemTypes() {
        Map<String, String> itemTypes = new HashMap<String, String>();
        itemTypes.put("101", "数码");
        itemTypes.put("102", "母婴");
        return itemTypes;
    }

    //商品查询
    @RequestMapping(value = "/queryItems")
    public ModelAndView queryItems(ItemsQueryVo itemsQueryVo) throws Exception {
        List<ItemsCustom> itemsList = itemsService.findItemsList(itemsQueryVo);

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("itemsList", itemsList);

        modelAndView.setViewName("items/itemsList");

        return modelAndView;
    }

    //单个商品的修改
    @RequestMapping(value = "/editItem")
    public String editItem(Model model, @RequestParam(value = "id", required = true) Integer id) throws Exception {

        ItemsCustom itemsCustom = itemsService.findItemsById(id);
        /*if(itemsCustom == null){
            throw  new CustomException("商品信息不存在.");
        }*/
        model.addAttribute("itemsCustom", itemsCustom);

        return "items/editItem";
    }

    //单个商品修改提交
    @RequestMapping(value = "/editItemSubmit")
    public String editItemSubmit(Model model, Integer id,
                                 @Validated(value = {ValidationGroup1.class}) ItemsCustom itemsCustom,
                                 BindingResult bindingResult,
                                 MultipartFile itemPic) throws Exception {
        //获取校验信息
        if (bindingResult.hasErrors()) {
            //输出错误信息
            List<ObjectError> allErrors = bindingResult.getAllErrors();

            for (ObjectError objectError : allErrors) {
                System.out.println(objectError.getDefaultMessage());
            }
            model.addAttribute("allErrors", allErrors);
            return "items/editItem";
        }
        String originalFilename = itemPic.getOriginalFilename();
        if (itemPic != null && originalFilename != null && originalFilename.length() > 0) {
            //存储图片的物理地址
            String picPath = "E:\\workspace_idea\\spring_batis\\file_upload\\temp\\";
            String newFileName = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));
            File newFile = new File(picPath + newFileName);
            //将文件从内存写入磁盘
            itemPic.transferTo(newFile);
            itemsCustom.setPic(newFileName);
        }
        itemsService.updateItems(id, itemsCustom);
        return "success";
    }

    //批量删除
    @RequestMapping(value = "/deleteItems")
    public String deleteItems(Model model,
                              Integer[] itemsId) throws Exception {
        //实现批量删除
        //
        model.addAttribute("message", "批量删除成功.");
        return "success";
    }

    //批量修改查询
    @RequestMapping(value = "/editItemsQuery")
    public ModelAndView editItemsQuery(ItemsQueryVo itemsQueryVo) throws Exception {
        List<ItemsCustom> itemsList = itemsService.findItemsList(itemsQueryVo);

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("itemsList", itemsList);

        modelAndView.setViewName("items/editItemsQuery");

        return modelAndView;
    }

    @RequestMapping(value = "/editItemsSubmit")
    public String editItemsSubmit(Model model, ItemsQueryVo itemsQueryVo) throws Exception {
        model.addAttribute("message", "批量修改成功");
        return "success";
    }

}
