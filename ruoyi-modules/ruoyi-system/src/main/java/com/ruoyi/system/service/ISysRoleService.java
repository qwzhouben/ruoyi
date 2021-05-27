package com.ruoyi.system.service;

import com.ruoyi.system.api.domain.SysRole;

import java.util.List;
import java.util.Set;

/**
 * @DESC:角色 业务
 * @AUTHOR: zhouben
 * @DATE: 2021/4/25 0025 15:12
 */
public interface ISysRoleService {

    /**
     * 根据条件分页查询角色数据
     *
     * @param role 角色信息
     * @return 角色数据集合信息
     */
    List<SysRole> selectRoleList(SysRole role);

    /**
     * 根据用户ID查询角色
     *
     * @param userId 用户ID
     * @return 权限列表
     */
    Set<String> selectRolePermissionByUserId(Long userId);

    /**
     * 查询所有角色
     * @return
     */
    List<SysRole> selectRoleAll();

    /**
     * 根据用户ID获取角色选择框列表
     * @param userId
     * @return
     */
    List<Integer> selectRoleListByUserId(Long userId);
}
