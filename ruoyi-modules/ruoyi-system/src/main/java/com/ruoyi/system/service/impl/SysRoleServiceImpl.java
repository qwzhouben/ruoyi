package com.ruoyi.system.service.impl;

import com.ruoyi.common.core.utils.StringUtils;
import com.ruoyi.system.api.domain.SysRole;
import com.ruoyi.system.mapper.SysRoleMapper;
import com.ruoyi.system.service.ISysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @DESC:角色 业务处理
 * @author: zhouben
 * @date: 2021/4/25 0025 15:16
 */
@Service
public class SysRoleServiceImpl implements ISysRoleService {

    @Autowired
    SysRoleMapper roleMapper;

    /**
     * 根据条件分页查询角色数据
     * @param role 角色信息
     * @return
     */
    @Override
    public List<SysRole> selectRoleList(SysRole role) {
        return roleMapper.selectRoleList(role);
    }

    /**
     * 根据用户ID查询角色
     *
     * @param userId 用户ID
     * @return 权限列表
     */
    @Override
    public Set<String> selectRolePermissionByUserId(Long userId) {
        List<SysRole> perms = roleMapper.selectRolePermissionByUserId(userId);
        Set<String> permsSet = new HashSet<>();
        for (SysRole perm : perms) {
            if (StringUtils.isNotNull(perm)) {
                permsSet.addAll(Arrays.asList(perm.getRoleKey().trim().split(",")));
            }
        }
        return permsSet;
    }

    /**
     * 查询所有角色
     * @return
     */
    @Override
    public List<SysRole> selectRoleAll() {
        return selectRoleList(new SysRole());
    }

    /**
     * 根据用户ID获取角色选择框列表
     * @param userId
     * @return
     */
    @Override
    public List<Integer> selectRoleListByUserId(Long userId) {
        return roleMapper.selectRoleListByUserId(userId);
    }
}
