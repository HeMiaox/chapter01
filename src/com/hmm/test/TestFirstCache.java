package com.hmm.test;

import com.hmm.mapper.SpecilMapper;
import com.hmm.po.Specil;
import com.hmm.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

public class TestFirstCache {

    public static void main(String[] args) {
        SqlSession sqlSessionA= MybatisUtils.getSqlSession(false);
        SpecilMapper specilMapper=sqlSessionA.getMapper(SpecilMapper.class);
        Specil specil=specilMapper.findSpecilById(1);
        System.out.println(specil);
        MybatisUtils.closeSqlSession(sqlSessionA);
        System.out.println("*****************");

        SqlSession sqlSessionB= MybatisUtils.getSqlSession(false);
        SpecilMapper specilMapperB=sqlSessionB.getMapper(SpecilMapper.class);
        Specil specil2=specilMapperB.findSpecilById(1);
        System.out.println(specil2);
        MybatisUtils.closeSqlSession(sqlSessionB);
        System.out.println("*****************");
    }
}
