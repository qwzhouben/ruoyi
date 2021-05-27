package com.ruoyi.system.mapper;

import com.ruoyi.system.api.domain.SysRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @DESC:
 * @AUTHOR: zhouben
 * @DATE: 2021/4/25 0025 15:20
 */
public interface SysRoleMapper {

    /**
     * 根据用户ID查询角色
     *
     * @param userId 用户ID
     * @return 角色列表
     */
    List<SysRole> selectRolePermissionByUserId(Long userId);

    /**
     * 根据用户ID查询角色
     *
     * @param username 用户名
     * @return 角色列表
     */
    List<SysRole> selectRolesByUserName(@Param("username") String username);

    /**
     * 根据条件分页查询角色数据
     * @param role
     * @return
     */
    List<SysRole> selectRoleList(SysRole role);

    /**
     * 根据用户ID获取角色选择框列表
     * @param userId
     * @return
     */
    List<Integer> selectRoleListByUserId(Long userId);
}
