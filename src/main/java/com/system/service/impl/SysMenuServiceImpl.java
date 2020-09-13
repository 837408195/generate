package com.system.service.impl;


import com.common.utils.StringUtils;

import com.system.domain.SysMenu;
import com.system.mapper.SysMenuMapper;
import com.system.service.ISysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 菜单 业务层处理
 * 
 * @author ruoyi
 */
@Service
public class SysMenuServiceImpl implements ISysMenuService
{

    @Autowired
    private SysMenuMapper menuMapper;


    @Override
    public List<SysMenu> selectMenuList(SysMenu menu)
    {
        List<SysMenu> menuList = menuMapper.selectMenuList(menu);
        return menuList;
    }
}
