package cn.itcast.web;
//web层 控制层，获取请求参数，调用service层，响应数据


import cn.itcast.domain.Items;
import cn.itcast.seervice.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("items")
public class ItemsController {
    @Autowired
    ItemsService itemsService;
    @RequestMapping("findById")
    public String findById(Model model){
        Items items = itemsService.findById(1);
        model.addAttribute("item",items);
        return "itemDetail";
    }
}
