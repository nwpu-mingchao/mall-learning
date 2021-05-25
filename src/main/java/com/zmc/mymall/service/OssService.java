package com.zmc.mymall.service;

import com.zmc.mymall.dto.OssCallbackResult;
import com.zmc.mymall.dto.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;

/**
 * oss上传管理Service
 */
public interface OssService {

    /**
     * oss上传管理Service
     * @return
     */
    OssPolicyResult policy();

    /**
     * oss上传成功回调
     * @param request
     * @return
     */
    OssCallbackResult callback(HttpServletRequest request);

}
