package com.wrong.demo1.dao;

import com.wrong.demo1.PO.ArticlePO;
import com.wrong.demo1.PO.ArticlePOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticlePOMapper {
    int countByExample(ArticlePOExample example);

    int deleteByExample(ArticlePOExample example);

    int deleteByPrimaryKey(String articleurl);

    int insert(ArticlePO record);

    int insertSelective(ArticlePO record);

    List<ArticlePO> selectByExample(ArticlePOExample example);

    ArticlePO selectByPrimaryKey(String articleurl);

    int updateByExampleSelective(@Param("record") ArticlePO record, @Param("example") ArticlePOExample example);

    int updateByExample(@Param("record") ArticlePO record, @Param("example") ArticlePOExample example);

    int updateByPrimaryKeySelective(ArticlePO record);

    int updateByPrimaryKey(ArticlePO record);
}