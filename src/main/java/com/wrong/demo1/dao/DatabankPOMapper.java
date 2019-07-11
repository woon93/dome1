package com.wrong.demo1.dao;

import com.wrong.demo1.PO.DatabankPO;
import com.wrong.demo1.PO.DatabankPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DatabankPOMapper {
    int countByExample(DatabankPOExample example);

    int deleteByExample(DatabankPOExample example);

    int deleteByPrimaryKey(String resourceurl);

    int insert(DatabankPO record);

    int insertSelective(DatabankPO record);

    List<DatabankPO> selectByExampleWithBLOBs(DatabankPOExample example);

    List<DatabankPO> selectByExample(DatabankPOExample example);

    DatabankPO selectByPrimaryKey(String resourceurl);

    int updateByExampleSelective(@Param("record") DatabankPO record, @Param("example") DatabankPOExample example);

    int updateByExampleWithBLOBs(@Param("record") DatabankPO record, @Param("example") DatabankPOExample example);

    int updateByExample(@Param("record") DatabankPO record, @Param("example") DatabankPOExample example);

    int updateByPrimaryKeySelective(DatabankPO record);

    int updateByPrimaryKeyWithBLOBs(DatabankPO record);

    int updateByPrimaryKey(DatabankPO record);
}