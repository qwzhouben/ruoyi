package com.ruoyi.system.domain;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 用户和岗位关联 sys_user_post
 *
 * @author ruoyi
 */
@Data
@Accessors(chain = true)
public class SysUserPost {
    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 岗位ID
     */
    private Long postId;

}
