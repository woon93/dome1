package com.wrong.demo1.dao;

import com.wrong.demo1.PO.urzInfoPO;
import com.wrong.demo1.PO.urzInfoPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface urzInfoPOMapper {
    int countByExample(urzInfoPOExample example);

    int deleteByExample(urzInfoPOExample example);

    int deleteByPrimaryKey(String urzid);

    int insert(urzInfoPO record);

    int insertSelective(urzInfoPO record);

    List<urzInfoPO> selectByExample(urzInfoPOExample example);

    urzInfoPO selectByPrimaryKey(String urzid);

    int updateByExampleSelective(@Param("record") urzInfoPO record, @Param("example") urzInfoPOExample example);

    int updateByExample(@Param("record") urzInfoPO record, @Param("example") urzInfoPOExample example);

    int updateByPrimaryKeySelective(urzInfoPO record);

    int updateByPrimaryKey(urzInfoPO record);
}