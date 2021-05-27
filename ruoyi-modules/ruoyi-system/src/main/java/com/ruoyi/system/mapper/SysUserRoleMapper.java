package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.SysUserRole;

import java.util.List;

/**
 * @DESC: 用户与角色关联表 数据层
 * @AUTHOR: zhouben
 * @DATE: 2021/5/27 0027 16:37
 */
public interface SysUserRoleMapper {

    /**
     * 通过用户ID删除用户和角色关联
     *
     * @param userId 用户ID
     * @return 结果
     */
    int deleteUserRoleByUserId(Long userId);

    /**
     * 批量新增用户角色信息
     *
     * @param userRoleList 用户角色列表
     * @return 结果
     */
    int batchUserRole(List<SysUserRole> userRoleList);
}
