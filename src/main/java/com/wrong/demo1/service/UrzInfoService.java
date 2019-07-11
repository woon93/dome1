package com.wrong.demo1.service;

import com.wrong.demo1.PO.UrzInfoPO;
import com.wrong.demo1.PO.UrzInfoPOExample;
import com.wrong.demo1.dao.UrzInfoPOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "UrzInfoService")
public class UrzInfoService {

    @Autowired
    private UrzInfoPOMapper urzInfoPOMapper;

    public UrzInfoPO getUrzInfoByAccount(String account){
        //  Mybatis Example Initial
        UrzInfoPOExample urzInfoPOExample = new UrzInfoPOExample();
        UrzInfoPOExample.Criteria criteria = urzInfoPOExample.createCriteria();

        // 【KEY】
        criteria.andUrzidEqualTo(account);

        // 【SORT】
        StringBuilder sortKey = new StringBuilder();
        sortKey.append("account DESC");
        urzInfoPOExample.setOrderByClause(sortKey.toString());

        //  excute Mapper
        List<UrzInfoPO> urzInfoPOList = urzInfoPOMapper.selectByExample(urzInfoPOExample);
        if (urzInfoPOList == null || urzInfoPOList.isEmpty()) {
            return new UrzInfoPO();
        } else {
            return urzInfoPOList.get(0);
        }
    }
}
