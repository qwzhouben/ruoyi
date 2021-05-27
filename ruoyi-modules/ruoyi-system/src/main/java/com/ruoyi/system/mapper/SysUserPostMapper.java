package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.SysUserPost;

import java.util.List;

/**
 * @DESC: 用户与岗位关联表 数据层
 * @AUTHOR: zhouben
 * @DATE: 2021/5/27 0027 16:37
 */
public interface SysUserPostMapper {

    /**
     * 通过用户ID删除用户和岗位关联
     *
     * @param userId 用户ID
     * @return 结果
     */
    int deleteUserPostByUserId(Long userId);

    /**
     * 批量新增用户岗位信息
     *
     * @param userPostList 用户角色列表
     * @return 结果
     */
    int batchUserPost(List<SysUserPost> userPostList);
}
