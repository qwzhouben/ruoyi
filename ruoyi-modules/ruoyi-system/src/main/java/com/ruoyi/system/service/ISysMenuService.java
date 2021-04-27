package com.ruoyi.system.service;

import com.ruoyi.system.api.domain.SysMenu;
import com.ruoyi.system.domain.vo.RouterVo;

import java.util.List;
import java.util.Set;

/**
 * @DESC:菜单 业务
 * @AUTHOR: zhouben
 * @DATE: 2021/4/25 0025 15:17
 */
public interface ISysMenuService {

    /**
     * 根据用户ID查询权限
     *
     * @param userId 用户ID
     * @return 权限列表
     */
    Set<String> selectMenuPermsByUserId(Long userId);

    /**
     * 根据用户ID查询菜单
     *
     * @param userId 用户名称
     * @return 菜单列表
     */
    List<SysMenu> selectMenuTreeByUserId(Long userId);

    /**
     * 构建前端路由所需要的菜单
     *
     * @param menus 菜单列表
     * @return 路由列表
     */
    List<RouterVo>  buildMenus(List<SysMenu> menus);
}
