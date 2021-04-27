package com.ruoyi.system.service;

import java.util.Set;

/**
 * @DESC:角色 业务
 * @AUTHOR: zhouben
 * @DATE: 2021/4/25 0025 15:12
 */
public interface ISysRoleService {

    /**
     * 根据用户ID查询角色
     *
     * @param userId 用户ID
     * @return 权限列表
     */
    Set<String> selectRolePermissionByUserId(Long userId);
}
