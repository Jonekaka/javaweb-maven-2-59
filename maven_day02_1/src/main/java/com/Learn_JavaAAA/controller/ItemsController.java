package com.learnCCC.controller;

import com.learnCCC.domain.Items;
import com.learnCCC.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
/*全局路径*/
@RequestMapping("/items")
public class ItemsController {
    /*将来会用到service,因此把service再注入进来*/
    @Autowired
    private ItemsService itemsService;
    /*方法路径*/
    @RequestMapping("/findDetail")
    public String findDetail(Model model){
        Items items = itemsService.findById(1);
        model.addAttribute("item", items);
        return "itemDetail";
    }
}
