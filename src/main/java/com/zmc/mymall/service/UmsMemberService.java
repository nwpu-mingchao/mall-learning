package com.zmc.mymall.service;

import com.zmc.mymall.common.api.CommonResult;

/**
 * 会员管理service
 */
public interface UmsMemberService {
    /**
     * 生成验证码
     * @param telephone
     * @return
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     * @param telephone
     * @param authCode
     * @return
     */
    CommonResult verifyAuthCode(String telephone,String authCode);
}
