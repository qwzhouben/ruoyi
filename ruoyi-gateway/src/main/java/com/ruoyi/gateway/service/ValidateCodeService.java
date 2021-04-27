package com.ruoyi.gateway.service;

import com.ruoyi.common.core.exception.CaptchaException;
import com.ruoyi.common.core.web.domain.AjaxResult;

import java.io.IOException;

/**
 * @DESC:验证码处理
 * @AUTHOR: zhouben
 * @DATE: 2021/4/25 0025 9:42
 */
public interface ValidateCodeService {

    /**
     * 生成验证码
     */
    AjaxResult createCapcha() throws IOException, CaptchaException;

    /**
     * 校验验证码
     */
    void checkCapcha(String key, String value) throws CaptchaException;
}
