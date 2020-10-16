package cn.hctech2006.softcup.isouserservice.mapper;


import cn.hctech2006.softcup.isouserservice.bean.SysRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysRole record);

    SysRole selectByPrimaryKey(Long id);

    List<SysRole> selectAll();

    int updateByPrimaryKey(SysRole record);
    int updateByPrimaryKey(List<SysRole> record);
}