package com.wrong.demo1.dao;

import com.wrong.demo1.PO.databankPO;
import com.wrong.demo1.PO.databankPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface databankPOMapper {
    int countByExample(databankPOExample example);

    int deleteByExample(databankPOExample example);

    int deleteByPrimaryKey(String resourceurl);

    int insert(databankPO record);

    int insertSelective(databankPO record);

    List<databankPO> selectByExampleWithBLOBs(databankPOExample example);

    List<databankPO> selectByExample(databankPOExample example);

    databankPO selectByPrimaryKey(String resourceurl);

    int updateByExampleSelective(@Param("record") databankPO record, @Param("example") databankPOExample example);

    int updateByExampleWithBLOBs(@Param("record") databankPO record, @Param("example") databankPOExample example);

    int updateByExample(@Param("record") databankPO record, @Param("example") databankPOExample example);

    int updateByPrimaryKeySelective(databankPO record);

    int updateByPrimaryKeyWithBLOBs(databankPO record);

    int updateByPrimaryKey(databankPO record);
}