package com.cobra.mybatisdemo.dao;

import com.cobra.mybatisdemo.dataobject.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author: Baron
 * @Description:
 * @Date: Created in 2019/3/16 1:46
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.cobra.mybatisdemo.dao")
public class UserInfoMapperTest {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByPrimaryKey() {
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(1);
        System.out.println(userInfo.getUsername());
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }

    @Test
    public void lstUser(){
        List<UserInfo> userInfos = userInfoMapper.listUser();
        System.out.println(userInfos);
    }
}