package com.ruoyi.system.service;

import com.ruoyi.system.api.domain.SysPost;

import java.util.List;

/**
 * @DESC:岗位信息 服务层
 * @AUTHOR: zhouben
 * @DATE: 2021/5/25 0025 11:02
 */
public interface ISysPostService {

    /**
     * 查询所有岗位
     * @return
     */
    List<SysPost> selectPostAll();

    /**
     * 根据用户ID获取岗位选择框列表
     * @param userId
     * @return
     */
    List<Integer> selectPostListByUserId(Long userId);
}
