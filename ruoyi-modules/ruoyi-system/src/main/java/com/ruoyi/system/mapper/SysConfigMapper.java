package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.SysConfig; /**
 * 参数配置 数据层
 *
 * @author ruoyi
 */
public interface SysConfigMapper {

    /**
     * 查询参数配置信息
     *
     * @param config 参数配置信息
     * @return 参数配置信息
     */
    SysConfig selectConfig(SysConfig config);
}