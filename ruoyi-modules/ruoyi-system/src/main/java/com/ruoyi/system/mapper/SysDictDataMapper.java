package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.SysDictData;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @DESC:字典表 数据层
 * @AUTHOR: zhouben
 * @DATE: 2021/5/27 0027 15:47
 */
public interface SysDictDataMapper {

    /**
     * 根据字典类型查询字典数据
     *
     * @param dictType 字典类型
     * @return 字典数据集合信息
     */
    List<SysDictData> selectDictDataByType(@Param("dictType") String dictType);
}
