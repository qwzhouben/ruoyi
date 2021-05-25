package com.ruoyi.system.service.impl;

import com.ruoyi.common.core.constant.UserConstants;
import com.ruoyi.common.core.utils.StringUtils;
import com.ruoyi.common.security.service.TokenService;
import com.ruoyi.system.api.domain.SysPost;
import com.ruoyi.system.api.domain.SysRole;
import com.ruoyi.system.api.domain.SysUser;
import com.ruoyi.system.mapper.SysPostMapper;
import com.ruoyi.system.mapper.SysRoleMapper;
import com.ruoyi.system.mapper.SysUserMapper;
import com.ruoyi.system.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import java.util.List;

/**
 * @DESC:用户 业务层处理
 * @author: zhouben
 * @date: 2021/4/25 0025 11:24
 */
@Service
public class SysUserServiceImpl implements ISysUserService {

    @Autowired
    SysUserMapper userMapper;
    @Autowired
    SysRoleMapper roleMapper;
    @Autowired
    SysPostMapper postMapper;
    @Autowired
    ISysUserService userService;
    @Autowired
    TokenService tokenService;

    /**
     * 通过用户名查询用户
     *
     * @param userName 用户名
     * @return 用户对象信息
     */
    @Override
    public SysUser selectUserByUserName(String userName) {
        return userMapper.selectUserByUserName(userName);
    }

    /**
     * 通过用户ID查询用户
     *
     * @param userId 用户ID
     * @return 用户对象信息
     */
    @Override
    public SysUser selectUserById(Long userId) {
        return userMapper.selectUserById(userId);
    }

    /**
     * 根据用户名查询用户所属角色组
     *
     * @param username
     * @return
     */
    @Override
    public String selectUserRoleGroup(String username) {
        List<SysRole> list = roleMapper.selectRolesByUserName(username);
        if (CollectionUtils.isEmpty(list)) {
            return "";
        }
        StringBuffer idsStr = new StringBuffer();
        for (SysRole role : list) {
            idsStr.append(role.getRoleName()).append(",");
        }
        if (StringUtils.isNotBlank(idsStr.toString())) {
            return idsStr.substring(0, idsStr.length() - 1);
        }
        return idsStr.toString();
    }

    /**
     * 根据用户ing查询用户所属岗位组
     *
     * @param username
     * @return
     */
    @Override
    public String selectUserPostGroup(String username) {
        List<SysPost> list = postMapper.selectPostsByUsername(username);
        if (CollectionUtils.isEmpty(list)) {
            return "";
        }
        StringBuffer idsStr = new StringBuffer();
        for (SysPost post : list) {
            idsStr.append(post.getPostName()).append(",");
        }
        if (StringUtils.isNotBlank(idsStr.toString())) {
            return idsStr.substring(0, idsStr.length() - 1);
        }
        return idsStr.toString();
    }

    /**
     * 校验手机号是否唯一
     *
     * @param user
     * @return
     */
    @Override
    public String checkPhoneUnique(SysUser user) {
        Long userId = StringUtils.isNull(user.getUserId()) ? -1L : user.getUserId();
        SysUser info = userMapper.checkPhoneUnique(user.getPhonenumber());
        if (StringUtils.isNotNull(info) && info.getUserId().longValue() != userId.longValue()) {
            return UserConstants.NOT_UNIQUE;
        }
        return UserConstants.UNIQUE;
    }

    /**
     * 校验邮箱是否唯一
     *
     * @param user
     * @return
     */
    @Override
    public String checkEmailUnique(SysUser user) {
        Long userId = StringUtils.isNull(user.getUserId()) ? -1L : user.getUserId();
        SysUser info = userMapper.checkEmailUnique(user.getEmail());
        if (StringUtils.isNotNull(info) && info.getUserId().longValue() != userId.longValue()) {
            return UserConstants.NOT_UNIQUE;
        }
        return UserConstants.UNIQUE;
    }

    /**
     * 修改用户基本信息
     *
     * @param user
     * @return
     */
    @Override
    public int updateUserProfile(SysUser user) {
        return userMapper.updateUser(user);
    }

    /**
     *
     * @param username
     * @param password
     * @return
     */
    @Override
    public int resetUserPwd(String username, String password) {
        return userMapper.resetUserPwd(username, password);
    }

}










































