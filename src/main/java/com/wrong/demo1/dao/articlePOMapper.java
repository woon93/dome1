package com.wrong.demo1.dao;

import com.wrong.demo1.PO.articlePO;
import com.wrong.demo1.PO.articlePOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface articlePOMapper {
    int countByExample(articlePOExample example);

    int deleteByExample(articlePOExample example);

    int deleteByPrimaryKey(String articleurl);

    int insert(articlePO record);

    int insertSelective(articlePO record);

    List<articlePO> selectByExample(articlePOExample example);

    articlePO selectByPrimaryKey(String articleurl);

    int updateByExampleSelective(@Param("record") articlePO record, @Param("example") articlePOExample example);

    int updateByExample(@Param("record") articlePO record, @Param("example") articlePOExample example);

    int updateByPrimaryKeySelective(articlePO record);

    int updateByPrimaryKey(articlePO record);
}