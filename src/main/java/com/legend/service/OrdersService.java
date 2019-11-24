package com.legend.service;

import com.legend.pojo.Orders;

/**
 * 订单操作 service
 *
 * @author legend
 */
public interface OrdersService {

    /**
     * 新增订单
     *
     * @param order
     */
    public void saveOrder(Orders order);

    /**
     * 修改订单状态，改为 支付成功，已付款; 同时新增支付流水
     *
     * @param orderId
     * @param alpayFlowNum
     * @param paidAmount
     */
    public void updateOrderStatus(String orderId, String alpayFlowNum, String paidAmount);

    /**
     * 获取订单
     *
     * @param orderId
     * @return
     */
    public Orders getOrderById(String orderId);

}
