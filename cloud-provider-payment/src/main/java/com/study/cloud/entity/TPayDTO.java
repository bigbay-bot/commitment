package com.study.cloud.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author fanweihua
 * @Date 2025/2/22 19:42
 * @Description
 */
@Data
public class TPayDTO {
    /**
     *
     */
    private Object id;

    /**
     * 支付流水号
     */
    private String payNo;

    /**
     * 订单流水号
     */
    private String orderNo;

    /**
     * 用户账号ID
     */
    private Integer userId;

    /**
     * 交易金额
     */
    private BigDecimal amount;
}
