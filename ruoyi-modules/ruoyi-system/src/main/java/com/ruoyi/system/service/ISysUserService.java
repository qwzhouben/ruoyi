package com.ruoyi.system.service;

import com.ruoyi.system.api.domain.SysUser;

/**
 * @DESC:用户 业务层
 * @AUTHOR: zhouben
 * @DATE: 2021/4/25 0025 11:24
 */
public interface ISysUserService {

    /**
     * 通过用户名查询用户
     *
     * @param userName 用户名
     * @return 用户对象信息
     */
    SysUser selectUserByUserName(String userName);

    /**
     * 通过用户ID查询用户
     *
     * @param userId 用户ID
     * @return 用户对象信息
     */
    SysUser selectUserById(Long userId);
}
