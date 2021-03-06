package com.ruoyi.system.mapper;

import com.ruoyi.system.api.domain.SysPost;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @DESC:岗位信息 数据层
 * @AUTHOR: zhouben
 * @DATE: 2021/5/20 0020 16:50
 */
public interface SysPostMapper {

    /**
     * 查询用户所属岗位组
     * @param username
     * @return
     */
    List<SysPost> selectPostsByUsername(@Param("username") String username);

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




















