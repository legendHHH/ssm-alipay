package com.legend.wx.config;

/**
 * @author legend
 * @version V1.0
 * @Description: 微信支付的一些参数配置
 * @date 2019年11月24日
 */
public class WeChatConfig {

    /**
     * 公众账号ID
     */
    public static final String APPID = "xxxxxxxxxxxxxxxx";
    /**
     * 商户号
     */
    public static final String MCH_ID = "yyyyyyyyyyyyyyy";
    /**
     * 商户密钥
     */
    public static final String KEY = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";

    /**
     * APP和网页支付提交用户端ip, Native支付填调用微信支付API的机器IP, 即：服务器ip地址
     */
    public static final String SPBILL_CREATE_IP = "127.0.0.1";
    /**
     * 接收微信支付异步通知回调地址，通知url必须为直接可访问的url，不能携带参数。(需要配置)
     */
    public static final String NOTIFY_URL = "http://1s7p978583.iok.la/wxpay/notify.action";
    /**
     * 支付方式，取值如下：JSAPI，NATIVE，APP
     */
    public static final String TRADE_TYPE = "NATIVE";
    /**
     * 微信支付 - 统一下单地址
     */
    public static final String PLACEANORDER_URL = "https://api.mch.weixin.qq.com/pay/unifiedorder";

}
