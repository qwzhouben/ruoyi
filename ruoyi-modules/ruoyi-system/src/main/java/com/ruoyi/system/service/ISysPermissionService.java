package com.ruoyi.system.service;

import java.util.Set;

/**
 * @DESC:权限 业务层
 * @AUTHOR: zhouben
 * @DATE: 2021/4/25 0025 15:12
 */
public interface ISysPermissionService {

    /**
     * 获取角色数据权限
     *
     * @param userId 用户Id
     * @return 角色权限信息
     */
    Set<String> getRolePermission(Long userId);

    /**
     * 获取菜单数据权限
     *
     * @param userId 用户Id
     * @return 菜单权限信息
     */
    Set<String> getMenuPermission(Long userId);
}
