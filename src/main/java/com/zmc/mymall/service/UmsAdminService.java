package com.zmc.mymall.service;

import com.zmc.mymall.mbg.model.UmsAdmin;
import com.zmc.mymall.mbg.model.UmsPermission;

import java.util.List;

/**
 * 后台管理员Service
 */
public interface UmsAdminService {

    /**
     * 根据用户名获取后台管理员
     * @param username
     * @return
     */
    UmsAdmin getAdminByUsername(String username);

    /**
     * 注册
     * @param umsAdminParam
     * @return
     */
    UmsAdmin register(UmsAdmin umsAdminParam);

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    String login(String username,String password);

    /**
     * 获取用户所有权限（包括角色权限 和 +-权限）
     * @param adminId
     * @return
     */
    List<UmsPermission> getPermissionList(Long adminId);

}
