package com.ruoyi.system.mapper;

import com.ruoyi.system.api.domain.SysDept;

import java.util.List;

/**
 * @DESC:部门数据层
 * @AUTHOR: zhouben
 * @DATE: 2021/5/25 0025 15:20
 */
public interface SysDeptMapper {

    /**
     * 查询部门管理数据
     *
     * @param dept 部门信息
     * @return 部门信息集合
     */
    List<SysDept> selectDeptList(SysDept dept);
}
