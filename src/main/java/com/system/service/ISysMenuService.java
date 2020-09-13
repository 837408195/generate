package com.system.service;

import com.system.domain.SysMenu;

import java.util.List;

/**
 * 菜单 业务层
 *
 * @author ruoyi
 */
public interface ISysMenuService {


    /**
     * 根据用户查询系统菜单列表
     *
     * @param menu 菜单信息
     * @return 菜单列表
     */
    public List<SysMenu> selectMenuList(SysMenu menu);
}

