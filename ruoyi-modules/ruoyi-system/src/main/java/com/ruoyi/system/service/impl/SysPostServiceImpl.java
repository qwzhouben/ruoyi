package com.ruoyi.system.service.impl;

import com.ruoyi.system.api.domain.SysPost;
import com.ruoyi.system.mapper.SysPostMapper;
import com.ruoyi.system.service.ISysPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @DESC:岗位信息 服务层处理
 * @author: zhouben
 * @date: 2021/5/25 0025 11:02
 */
@Service
public class SysPostServiceImpl implements ISysPostService {

    @Autowired
    private SysPostMapper postMapper;

    /**
     * 查询所有岗位
     * @return
     */
    @Override
    public List<SysPost> selectPostAll() {
        return postMapper.selectPostAll();
    }

    /**
     * 根据用户ID获取岗位选择框列表
     * @param userId
     * @return
     */
    @Override
    public List<Integer> selectPostListByUserId(Long userId) {
        return postMapper.selectPostListByUserId(userId);
    }
}
