package com.legend.wx.service;

import javax.servlet.http.HttpServletRequest;

import com.legend.wx.entity.PayResult;
import com.legend.wx.entity.PreOrderResult;

/**
 * @author legend
 * @version V1.0
 * @Description: 处理微信支付的相关订单业务
 * @date 2019年11月24日
 */
public interface WxOrderService {

    /**
     * 调用微信接口进行统一下单
     *
     * @param body
     * @param out_trade_no
     * @param total_fee
     * @return
     * @throws Exception
     */
    public PreOrderResult placeOrder(String body, String out_trade_no, String total_fee) throws Exception;

    /**
     * 获取支付结果
     *
     * @param request
     * @return
     * @throws Exception
     * @Description:
     */
    public PayResult getWxPayResult(HttpServletRequest request) throws Exception;

}
