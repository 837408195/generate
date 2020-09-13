package com.system.mapper;

import com.system.domain.SysDictType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 字典表 数据层
 * 
 * @author ruoyi
 */
@Mapper
public interface SysDictTypeMapper
{

    /**
     * 根据所有字典类型
     * 
     * @return 字典类型集合信息
     */
    public List<SysDictType> selectDictTypeAll();
}
