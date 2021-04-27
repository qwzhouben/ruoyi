package com.ruoyi.system.mapper;

import com.ruoyi.system.api.domain.SysUser;

/**
 * @DESC:用户表 数据层
 * @AUTHOR: zhouben
 * @DATE: 2021/4/25 0025 11:26
 */
public interface SysUserMapper {

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
