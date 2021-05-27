package com.ruoyi.system.service;

import com.ruoyi.system.api.domain.SysUser;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

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

    /**
     * 根据条件分页查询用户列表
     * @param user
     * @return
     */
    List<SysUser> selectUserList(SysUser user);

    /**
     * 校验用户是否允许操作
     *
     * @param user 用户信息
     */
    void checkUserAllowed(SysUser user);

    /**
     * 修改用户状态
     *
     * @param user 用户信息
     * @return 结果
     */
    int updateUserStatus(SysUser user);

    /**
     * 修改用户
     * @param user
     * @return
     */
    int updateUser(SysUser user);

    /**
     * 校验用户名称是否唯一
     *
     * @param userName 用户名称
     * @return 结果
     */
    String checkUserNameUnique(String userName);

    /**
     * 新增用户信息
     *
     * @param user 用户信息
     * @return 结果
     */
    int insertUser(SysUser user);

    /**
     * 重置用户密码
     * @param user
     * @return
     */
    int resetPwd(SysUser user);
}
