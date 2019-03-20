package com.cobra.mybatisdemo.controller;

import com.cobra.mybatisdemo.dataobject.UserInfo;
import com.cobra.mybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: Baron
 * @Description:
 * @Date: Created in 2019/3/16 12:10
 */
@RestController
@RequestMapping("/user")
@CacheConfig(cacheNames = "user")
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 添加用户
     * @param userInfo
     * @return
     */
    @PostMapping("/add")
    //@CacheEvict(cacheNames = "user",key = "123456")
    @CacheEvict(key = "123456")
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
    //@CacheEvict(cacheNames = "user",key = "123456")
    @CacheEvict(key = "123456")
    public int update(UserInfo userInfo) {
        return userService.update(userInfo);
    }

    /**
     * 根据userId删除用户
     * @param userId
     * @return
     */
    @DeleteMapping("/{userId}")
    //@CacheEvict(cacheNames = "user",key = "123456")
    @CacheEvict(key = "123456")
    public int deleteByUserId(@PathVariable("userId") Integer userId) {
        return userService.deleteByUserId(userId);
    }

    /**
     * 获取所有的UserInfo
     * @return
     */
    @GetMapping("/list")
    //@Cacheable(cacheNames = "user",key = "123456")
    @Cacheable(key = "123456")
    public List<UserInfo> findAll() {
        return userService.findAll();
    }

}
