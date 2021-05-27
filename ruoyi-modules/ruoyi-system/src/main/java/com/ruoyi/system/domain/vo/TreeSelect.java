package com.ruoyi.system.domain.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ruoyi.system.api.domain.SysDept;
import com.ruoyi.system.api.domain.SysMenu;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @DESC:Treeselect树结构实体类
 * @author: zhouben
 * @date: 2021/5/25 0025 15:17
 */
@Data
public class TreeSelect implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 节点ID
     */
    private Long id;

    /**
     * 节点名称
     */
    private String label;

    /**
     * 子节点
     */
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<TreeSelect> children;

    public TreeSelect() {

    }

    public TreeSelect(SysDept dept) {
        this.id = dept.getDeptId();
        this.label = dept.getDeptName();
        this.children = dept.getChildren().stream().map(TreeSelect::new).collect(Collectors.toList());
    }

    public TreeSelect(SysMenu menu) {
        this.id = menu.getMenuId();
        this.label = menu.getMenuName();
        this.children = menu.getChildren().stream().map(TreeSelect::new).collect(Collectors.toList());
    }

}
