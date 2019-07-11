package com.wrong.demo1.dao;

import com.wrong.demo1.PO.SysInfoPO;
import com.wrong.demo1.PO.SysInfoPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysInfoPOMapper {
    int countByExample(SysInfoPOExample example);

    int deleteByExample(SysInfoPOExample example);

    int deleteByPrimaryKey(String normid);

    int insert(SysInfoPO record);

    int insertSelective(SysInfoPO record);

    List<SysInfoPO> selectByExample(SysInfoPOExample example);

    SysInfoPO selectByPrimaryKey(String normid);

    int updateByExampleSelective(@Param("record") SysInfoPO record, @Param("example") SysInfoPOExample example);

    int updateByExample(@Param("record") SysInfoPO record, @Param("example") SysInfoPOExample example);

    int updateByPrimaryKeySelective(SysInfoPO record);

    int updateByPrimaryKey(SysInfoPO record);
}