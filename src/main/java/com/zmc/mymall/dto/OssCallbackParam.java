package com.zmc.mymall.dto;

import io.swagger.annotations.ApiModelProperty;

/**
 * oss上传成功后的回调参数
 * oss上传成功后，根据该配置参数来回调对应接口
 */
public class OssCallbackParam {
    @ApiModelProperty("请求回调的地址")
    private String callbackUrl;
    @ApiModelProperty("回调时传入request中的参数")
    private String callbackBody;
    @ApiModelProperty("回调时传入参数的格式，比如表单提交形式")
    private String callbackBodyType;

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public String getCallbackBody() {
        return callbackBody;
    }

    public void setCallbackBody(String callbackBody) {
        this.callbackBody = callbackBody;
    }

    public String getCallbackBodyType() {
        return callbackBodyType;
    }

    public void setCallbackBodyType(String callbackBodyType) {
        this.callbackBodyType = callbackBodyType;
    }
}
