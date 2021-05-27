package com.ruoyi.system.service;

import com.ruoyi.system.api.domain.SysDept;
import com.ruoyi.system.domain.vo.TreeSelect;

import java.util.List;

/**
 * @DESC:部门 业务层
 * @AUTHOR: zhouben
 * @DATE: 2021/5/25 0025 15:15
 */
public interface ISysDeptService {

    /**
     * 查询部门管理数据
     *
     * @param dept 部门信息
     * @return 部门信息集合
     */
    List<SysDept> selectDeptList(SysDept dept);

    /**
     * 构建前端所需要下拉树结构
     *
     * @param depts 部门列表
     * @return 下拉树结构列表
     */
    List<TreeSelect> buildDeptTreeSelect(List<SysDept> depts);
}
