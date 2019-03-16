package com.cobra.mybatisdemo.dao;

import com.cobra.mybatisdemo.dataobject.OrderInfo;
import com.cobra.mybatisdemo.dto.OrderDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: Baron
 * @Description:
 * @Date: Created in 2019/3/16 18:56
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.cobra.mybatisdemo.dao")
public class OrderInfoMapperTest {

    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @Test
    public void selectByUserId() {
        List<OrderInfo> orderInfos = orderInfoMapper.selectByUserId(2);
        System.out.println(orderInfos);
    }

    @Test
    public void selectOrderDTOListByUserId() {
        List<OrderDTO> orderDTOList = orderInfoMapper.selectOrderDTOListByUserId(2);
        System.out.println(orderDTOList);
    }
}