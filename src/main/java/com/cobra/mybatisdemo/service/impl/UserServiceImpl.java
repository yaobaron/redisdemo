package com.cobra.mybatisdemo.service.impl;

import com.cobra.mybatisdemo.dao.UserInfoMapper;
import com.cobra.mybatisdemo.dataobject.UserInfo;
import com.cobra.mybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Baron
 * @Description:
 * @Date: Created in 2019/3/16 12:07
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    /**
     * 添加用户
     *
     * @param userInfo
     * @return
     */
    @Override
    public int add(UserInfo userInfo) {
        return userInfoMapper.insertSelective(userInfo);
    }

    /**
     * 修改用户
     *
     * @param userInfo
     * @return
     */
    @Override
    public int update(UserInfo userInfo) {
        return userInfoMapper.updateByPrimaryKeySelective(userInfo);
    }

    /**
     * 删除用户
     *
     * @param userId
     * @return
     */
    @Override
    public int deleteByUserId(Integer userId) {
        return userInfoMapper.deleteByPrimaryKey(userId);
    }

    /**
     * 通过userId查找用户
     *
     * @param userId
     * @return
     */
    @Override
    public UserInfo findByUserId(Integer userId) {
        return userInfoMapper.selectByPrimaryKey(userId);
    }

    /**
     * 查找所有UserInfo
     *
     * @return
     */
    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.listUser();
    }
}
