package com.hthyaq.zybadmin.controller;


import com.hthyaq.zybadmin.model.bean.GlobalResult;
import com.hthyaq.zybadmin.model.entity.User;
import com.hthyaq.zybadmin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author hk
 * @since 2019-08-09
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired private UserService userService;


    @GetMapping("/add")
    public User add(@RequestParam(value = "name") String name, @RequestParam(value = "pwd") String pwd) {
        User user = new User();
        user.setName(name);
        user.setPwd(pwd);
        userService.save(user);
        return user;
        }
    @GetMapping("/delete")
    public User delete(@RequestParam(value = "id") Integer id){
        User user = userService.getById(id);
        userService.removeById(user);
        return user;
    }
    @GetMapping("/list")
    public User list(@RequestParam(value = "id") Integer id){
        User user = userService.getById(id);
        userService.list();
        return user;
    }
    @GetMapping("/update")
    public User update(@RequestParam(value = "id") Integer id,@RequestParam(value = "name") String name,@RequestParam(value = "pwd") String pwd){
        User user = userService.getById(id);
        user.setName(name);
        user.setPwd(pwd);
        userService.updateById(user);
        return user;
    }

    @GetMapping("/delete1")
    public GlobalResult delete1(@RequestParam(value = "id") Integer id){
        boolean b = userService.deleteById(id);
        return b?GlobalResult.success("成功"):GlobalResult.fail("失败");
    }

    @GetMapping("/query")
    public List<User> queryUserByName(String name){
        List<User> users = userService.queryUserByName(name);
        return users;
    }
    @GetMapping("/queryById")
    public List<User> queryById(@RequestParam(value = "id") Integer id){
        List<User> users = userService.queryById(id);
        return users;
    }

}
