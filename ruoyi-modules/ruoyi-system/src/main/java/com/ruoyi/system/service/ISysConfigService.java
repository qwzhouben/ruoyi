package com.ruoyi.system.service;

/**
 * @DESC: 参数配置 服务层
 * @AUTHOR: zhouben
 * @DATE: 2021/5/27 0027 16:14
 */
public interface ISysConfigService {

    /**
     * 根据键名查询参数配置信息
     *
     * @param configKey 参数键名
     * @return 参数键值
     */
    String selectConfigByKey(String configKey);
}
