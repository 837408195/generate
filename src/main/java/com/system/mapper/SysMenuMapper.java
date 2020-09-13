package com.system.mapper;

import com.system.domain.SysMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 菜单表 数据层
 *
 * @author ruoyi
 */
@Mapper
public interface SysMenuMapper {
    /**
     * 查询系统菜单列表
     *
     * @param menu 菜单信息
     * @return 菜单列表
     */
    public List<SysMenu> selectMenuList(SysMenu menu);
}
