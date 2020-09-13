package com.system.controller;

import com.common.constant.Constants;
import com.common.core.controller.BaseController;
import com.common.core.domain.AjaxResult;
import com.common.utils.ServletUtils;
import com.common.utils.StringUtils;
import com.system.domain.SysMenu;
import com.system.service.ISysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 菜单信息
 * 
 * @author ruoyi
 */
@RestController
@RequestMapping("/system/menu")
public class SysMenuController extends BaseController
{
    @Autowired
    private ISysMenuService menuService;

    /**
     * 获取菜单列表
     */
    @GetMapping("/list")
    public AjaxResult list(SysMenu menu)
    {
        List<SysMenu> menus = menuService.selectMenuList(menu);
        return AjaxResult.success(menus);
    }
}