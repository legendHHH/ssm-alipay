## Spring MVC+Spring+Mybatis实现支付宝支付功能
![](https://img2018.cnblogs.com/blog/1231979/201911/1231979-20191119181540583-823767867.png)

### 1. 下载电脑网站的官方demo：
[官方DEMO](https://docs.open.alipay.com/270/106291/)
![](https://img2018.cnblogs.com/blog/1231979/201911/1231979-20191120113554725-211273751.png)

### 2. 下载解压导入eclipse
![](https://img2018.cnblogs.com/blog/1231979/201911/1231979-20191120124759987-404430818.png)

readme.txt请好好看一下。
只有一个Java配置类，其余都是JSP。



### 3. 配置AlipayConfig
#### (1) 注册蚂蚁金服开发者账号（免费，不像苹果会收取费用）

注册地址：https://open.alipay.com ，用你的支付宝账号扫码登录，完善个人信息，选择服务类型（我选的是自研）。


#### (2) 设置app_id和gatewayUrl

![](https://img2018.cnblogs.com/blog/1231979/201911/1231979-20191120125004822-1142486894.png)


![](https://img2018.cnblogs.com/blog/1231979/201911/1231979-20191120125055898-1121198662.png)

其中密钥需要自己生成，appID和支付宝网关是已经给好的，网关有dev字样，表明是用于开发测试。


#### (3) 设置密钥
![](https://img2018.cnblogs.com/blog/1231979/201911/1231979-20191120125222210-1100726664.png)


https://docs.open.alipay.com/291/105971

![](https://img2018.cnblogs.com/blog/1231979/201911/1231979-20191120125307809-937650347.png)



- 下载密钥生成工具，解压打开后，选择2048位生成密钥：
![](https://img2018.cnblogs.com/blog/1231979/201911/1231979-20191120125345713-1021302946.png)


- 如果没有设置过，此时显示文本是"设置应用公钥"，我这里是已经设置过得。
![](https://img2018.cnblogs.com/blog/1231979/201911/1231979-20191120125435941-393811711.png)

- 设置方法,"打开密钥文件路径"：
![](https://img2018.cnblogs.com/blog/1231979/201911/1231979-20191120125507426-37097754.png)

`选择应用公钥2048`

- 复制应用公钥2048.txt中的内容到点击"设置应用公钥"的弹出框中，保存：
![](https://img2018.cnblogs.com/blog/1231979/201911/1231979-20191120125611993-16854524.png)


##### 商家

- 商户私钥（merchant_private_key）
复制 应用私钥2048.txt 中的内容到merchant_private_key中。

- 支付宝公钥（alipay_public_key）
![](https://img2018.cnblogs.com/blog/1231979/201911/1231979-20191120125659891-581581184.png)

点击如上图链接，复制弹出框里面的内容到alipay_public_key。

如果这个设置不对，结果是：支付成功，但是验签失败。

- 如果是正式环境，需要上传到对应的应用中：
https://docs.open.alipay.com/291/105972/

![](https://img2018.cnblogs.com/blog/1231979/201911/1231979-20191120125824572-460322041.png)



#### (4) 服务器异步通知页面路径（notify_url）

如果没有改名，修改IP和端口号就可以了，我自己的如下:

http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp
#### (5) 页面跳转同步通知页面的路径（return_url）

http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp



### 测试
![](https://img2018.cnblogs.com/blog/1231979/201911/1231979-20191120125924668-704849280.png)
![](https://img2018.cnblogs.com/blog/1231979/201911/1231979-20191120125941534-834706478.png)

测试用的支付宝买家账户可以在"沙箱账"这个页面可以找到：
![](https://img2018.cnblogs.com/blog/1231979/201911/1231979-20191120130048110-763179124.png)


支付成功后，验签结果：
![](https://img2018.cnblogs.com/blog/1231979/201911/1231979-20191120130128462-1161668049.png)


### 问题解决

由于我们使用的是沙箱测试环境，测试环境和正式上线的环境的网关是不一样的，如果配置错误，会出现，appid错误的问题。配置如下：

![](https://img2018.cnblogs.com/blog/1231979/201911/1231979-20191120130212659-823408049.png)


### 二、将支付宝支付整合到ssm框架