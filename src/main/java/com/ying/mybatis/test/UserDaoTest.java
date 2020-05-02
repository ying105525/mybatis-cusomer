package com.ying.mybatis.test;

import com.ying.mybatis.io.Resources;
import com.ying.mybatis.sqlsession.SqlSessionFactory;
import com.ying.mybatis.sqlsession.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

/**
 * @author 应森亮
 * @date 2020/05/02
 * @desc 测试手写mybatis手写
 */
public class UserDaoTest {


    @Test
    public void testQueryById(){

        // 1.指定全局配置文件路径
        String location = "mybatis-config.xml";

        // 2.将配置文件转换为InputStream
        InputStream inputStream = Resources.getResourceAsStream(location);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //        TODO:

    }

}
