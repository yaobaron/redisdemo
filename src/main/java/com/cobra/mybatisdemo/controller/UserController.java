package com.cobra.mybatisdemo.controller;

import com.cobra.mybatisdemo.dataobject.UserInfo;
import com.cobra.mybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: Baron
 * @Description:
 * @Date: Created in 2019/3/16 12:10
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 添加用户
     * @param userInfo
     * @return
     */
    @PostMapping("/add")
    public int add(UserInfo userInfo) {
        return userService.add(userInfo);
    }

    /**
     * 根据userId查找用户
     * @param userId
     * @return
     */
    @GetMapping("/{userId}")
    public UserInfo findByUserId(@PathVariable("userId") Integer userId) {
        return userService.findByUserId(userId);
    }

    /**
     * 更改用户信息
     * @param userInfo
     * @return
     */
    @PostMapping("/update")
    public int update(UserInfo userInfo) {
        return userService.update(userInfo);
    }

    /**
     * 根据userId删除用户
     * @param userId
     * @return
     */
    @DeleteMapping("/{userId}")
    public int deleteByUserId(@PathVariable("userId") Integer userId) {
        return userService.deleteByUserId(userId);
    }

}
