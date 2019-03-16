package com.cobra.mybatisdemo.dto;

import java.math.BigDecimal;

/**
 * @Author: Baron
 * @Description:
 * @Date: Created in 2019/3/16 19:01
 */
public class OrderDTO {

    private Integer orderId;

    private String orderDesc;

    private BigDecimal orderFee;

    private String username;

    private String email;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    public BigDecimal getOrderFee() {
        return orderFee;
    }

    public void setOrderFee(BigDecimal orderFee) {
        this.orderFee = orderFee;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "orderId=" + orderId +
                ", orderDesc='" + orderDesc + '\'' +
                ", orderFee=" + orderFee +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
