package com.hmm.test;

import com.hmm.mapper.SpecilMapper;
import com.hmm.po.Specil;
import com.hmm.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TestIf4 {

    public static void main(String[] args) {
        SqlSession sqlSessionA= MybatisUtils.getSqlSession(false);
        int pageNum=1;
        int pageSize=3;

        int start=(pageNum-1)*pageSize;
        String colName="spilinfoname";
        String keyword="技术";
        Map<String,Object>map=new HashMap<>();
        map.put("start",start);
        map.put("pageSize",pageSize);
        map.put("colName",colName);
        map.put("keyword",keyword);


        SpecilMapper specilMapper=sqlSessionA.getMapper(SpecilMapper.class);
        List<Specil> specilList =specilMapper.findAllSplit4(map);

        for (Specil specil : specilList) {
            System.out.println(specil);
        }
    }
}
