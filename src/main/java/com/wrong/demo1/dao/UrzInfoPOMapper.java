package com.wrong.demo1.dao;

import com.wrong.demo1.PO.UrzInfoPO;
import com.wrong.demo1.PO.UrzInfoPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UrzInfoPOMapper {
    int countByExample(UrzInfoPOExample example);

    int deleteByExample(UrzInfoPOExample example);

    int deleteByPrimaryKey(String urzid);

    int insert(UrzInfoPO record);

    int insertSelective(UrzInfoPO record);

    List<UrzInfoPO> selectByExample(UrzInfoPOExample example);

    UrzInfoPO selectByPrimaryKey(String urzid);

    int updateByExampleSelective(@Param("record") UrzInfoPO record, @Param("example") UrzInfoPOExample example);

    int updateByExample(@Param("record") UrzInfoPO record, @Param("example") UrzInfoPOExample example);

    int updateByPrimaryKeySelective(UrzInfoPO record);

    int updateByPrimaryKey(UrzInfoPO record);
}