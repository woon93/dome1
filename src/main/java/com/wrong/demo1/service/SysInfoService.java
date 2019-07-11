package com.wrong.demo1.service;

import com.wrong.demo1.PO.SysInfoPO;
import com.wrong.demo1.PO.SysInfoPOExample;
import com.wrong.demo1.dao.SysInfoPOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "SysInfoService")
public class SysInfoService {

    @Autowired
    private SysInfoPOMapper sysInfoPOMapper;

    public List<SysInfoPO> getSysInfoByClaz(String clazID){
        //  Mybatis Example Initial
        SysInfoPOExample sysInfoPOExample = new SysInfoPOExample();
        SysInfoPOExample.Criteria criteria = sysInfoPOExample.createCriteria();

        // 【KEY】
        criteria.andClazidEqualTo(clazID);

        // 【SORT】
        StringBuilder sort = new StringBuilder();
        sort.append("clazID ASC");
        sysInfoPOExample.setOrderByClause(sort.toString());

        //  excute Mapper
        List<SysInfoPO> sysInfoPOList = sysInfoPOMapper.selectByExample(sysInfoPOExample);
        return sysInfoPOList;
    }

    public SysInfoPO getSysInfoByNormID(String normID){
        //  excute Mapper
        SysInfoPO sysInfoPO = sysInfoPOMapper.selectByPrimaryKey(normID);
        return sysInfoPO;
    }
}
