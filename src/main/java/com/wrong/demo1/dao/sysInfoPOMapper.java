package com.wrong.demo1.dao;

import com.wrong.demo1.PO.sysInfoPO;
import com.wrong.demo1.PO.sysInfoPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface sysInfoPOMapper {
    int countByExample(sysInfoPOExample example);

    int deleteByExample(sysInfoPOExample example);

    int deleteByPrimaryKey(String normid);

    int insert(sysInfoPO record);

    int insertSelective(sysInfoPO record);

    List<sysInfoPO> selectByExample(sysInfoPOExample example);

    sysInfoPO selectByPrimaryKey(String normid);

    int updateByExampleSelective(@Param("record") sysInfoPO record, @Param("example") sysInfoPOExample example);

    int updateByExample(@Param("record") sysInfoPO record, @Param("example") sysInfoPOExample example);

    int updateByPrimaryKeySelective(sysInfoPO record);

    int updateByPrimaryKey(sysInfoPO record);
}