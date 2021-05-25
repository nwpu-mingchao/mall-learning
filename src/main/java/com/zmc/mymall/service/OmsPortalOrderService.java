package com.zmc.mymall.service;

import com.zmc.mymall.common.api.CommonResult;
import com.zmc.mymall.dto.OrderParam;
import org.springframework.transaction.annotation.Transactional;

/**
 * 前台订单管理Service
 */
public interface OmsPortalOrderService {

    /**
     * 根据提交信息生成订单
     * @param orderParam
     * @return
     */
    @Transactional
    CommonResult generateOrder(OrderParam orderParam);

    /**
     * 取消超市订单
     * @param orderId
     */
    @Transactional
    void cancelOrder(Long orderId);

}
