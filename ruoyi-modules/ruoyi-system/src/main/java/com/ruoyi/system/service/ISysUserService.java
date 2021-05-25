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

    /**
     * 根据用户名查询用户所属角色组
     * @param username
     * @return
     */
    String selectUserRoleGroup(String username);

    /**
     * 根据用户ing查询用户所属岗位组
     * @param username
     * @return
     */
    String selectUserPostGroup(String username);

    /**
     * 校验手机号是否唯一
     * @param user
     * @return
     */
    String checkPhoneUnique(SysUser user);

    /**
     * 校验邮箱是否唯一
     * @param user
     * @return
     */
    String checkEmailUnique(SysUser user);

    /**
     * 修改用户基本信息
     * @param user
     * @return
     */
    int updateUserProfile(SysUser user);

    /**
     * 修改用户密码
     * @param username
     * @param password
     * @return
     */
    int resetUserPwd(String username, String password);
}
