package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import cn.itcast.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

//控制层
@Controller
@RequestMapping("/account")
public class AccountController {

    //注入accountService
    @Autowired
    private AccountServiceImpl accountService;

    //添加数据,调用service层方法,添加后给页面提示保存成功的信息,
    @RequestMapping(value = "/save",produces="text/html;charset=UTF-8" )
    @ResponseBody
    public String save(Account account) {
        accountService.save(account);
        //response.setCharacterEncoding("text/html;charset=UTF-8");
        return "保存成功";
    }


    //查询所有
    @RequestMapping(value = "/findAll",produces="text/html;charset=UTF-8" )
    public ModelAndView findAll(ModelAndView modelAndView) {
        List<Account> accountList = accountService.findAll();
        modelAndView.addObject("accountList",accountList);
        modelAndView.setViewName("accountList");

        return modelAndView;
    }



}
