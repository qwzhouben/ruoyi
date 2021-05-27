package com.ruoyi.system.service;

import com.ruoyi.system.domain.SysDictData;

import java.util.List;

/**
 * @DESC: 字典 业务层
 * @AUTHOR: zhouben
 * @DATE: 2021/5/27 0027 15:31
 */
public interface ISysDictTypeService {

    /**
     * 根据字典类型查询字典数据
     *
     * @param dictType 字典类型
     * @return 字典数据集合信息
     */
    List<SysDictData> selectDictDataByType(String dictType);
}
