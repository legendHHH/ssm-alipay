package com.legend.controller;

import com.legend.pojo.User;
import com.legend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list")
    public ModelAndView products() throws Exception {
        //获取用户列表
        List<User> userList = userService.getUserList();
        ModelAndView model = new ModelAndView("user");
        model.addObject("userList", userList);
        return model;
    }
}