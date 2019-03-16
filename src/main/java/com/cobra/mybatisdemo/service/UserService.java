package com.cobra.mybatisdemo.service;

import com.cobra.mybatisdemo.dataobject.UserInfo;

import java.util.List;

/**
 * @Author: Baron
 * @Description:
 * @Date: Created in 2019/3/16 11:52
 */
public interface UserService {

    /**
     * 添加用户
     * @param userInfo
     * @return
     */
    public int add(UserInfo userInfo);

    /**
     * 修改用户
     * @param userInfo
     * @return
     */
    public int update(UserInfo userInfo);

    /**
     * 删除用户
     * @param userId
     * @return
     */
    public int deleteByUserId(Integer userId);

    /**
     * 通过userId查找用户
     * @param userId
     * @return
     */
    public UserInfo findByUserId(Integer userId);

}
