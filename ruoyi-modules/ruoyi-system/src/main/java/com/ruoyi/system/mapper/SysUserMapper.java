package com.ruoyi.system.mapper;

import com.ruoyi.system.api.domain.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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

    /**
     * 校验手机号码是否唯一
     *
     * @param phoneNumber 手机号码
     * @return 结果
     */
    SysUser checkPhoneUnique(@Param("phoneNumber") String phoneNumber);

    /**
     * 校验邮箱是否唯一
     *
     * @param email 邮箱
     * @return 结果
     */
    SysUser checkEmailUnique(@Param("email") String email);

    /**
     * 更新用户
     * @param user
     * @return
     */
    int updateUser(SysUser user);

    /**
     * 更新用户密码
     * @param username
     * @param password
     * @return
     */
    int resetUserPwd(@Param("username") String username, @Param("password") String password);

    /**
     * 根据条件分页查询用户列表
     * @param user
     * @return
     */
    List<SysUser> selectUserList(SysUser user);

    /**
     * 校验用户名称是否唯一
     *
     * @param userName 用户名称
     * @return 结果
     */
    int checkUserNameUnique(String userName);

    /**
     * 新增用户信息
     *
     * @param user 用户信息
     * @return 结果
     */
    int insertUser(SysUser user);
}
