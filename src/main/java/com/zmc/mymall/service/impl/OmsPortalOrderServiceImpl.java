package com.zmc.mymall.service.impl;

import com.zmc.mymall.common.api.CommonResult;
import com.zmc.mymall.compoent.CancelOrderSender;
import com.zmc.mymall.dto.OrderParam;
import com.zmc.mymall.service.OmsPortalOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OmsPortalOrderServiceImpl implements OmsPortalOrderService {
    private static Logger LOGGER = LoggerFactory.getLogger(OmsPortalOrderServiceImpl.class);

    @Autowired
    private CancelOrderSender cancelOrderSender;

    @Override
    public CommonResult generateOrder(OrderParam orderParam) {
        // TODO 执行一系列下单操作，具体参考mall项目
        LOGGER.info("process generateOrder");
        // 下单完成之后开启一个消息延迟，用于当用户没有付款时取消订单（orderId应该在下单之后生成）
        sendDelayMessageCancelOrder(11L);
        return CommonResult.success(null,"下单成功");
    }

    @Override
    public void cancelOrder(Long orderId) {
        // TODO 执行一系列取消订单的操作，具体参考mall项目
        LOGGER.info("process cancelOrder orderId:{}",orderId);
    }

    private void sendDelayMessageCancelOrder(Long orderId) {
        // 订单超时时间，假设为60分钟（测试中用30秒）
        long delayTimes = 30 * 1000;
        // 发送延迟消息
        cancelOrderSender.sendMessage(orderId,delayTimes);
    }
}
