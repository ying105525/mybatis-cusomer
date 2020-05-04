package com.ying.mybatis.test;

import com.ying.mybatis.io.Resources;
import com.ying.mybatis.po.User;
import com.ying.mybatis.sqlsession.SqlSession;
import com.ying.mybatis.sqlsession.SqlSessionFactory;
import com.ying.mybatis.sqlsession.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

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

        // SqlSession表示一个SQL会话，每次都new，如果对于SqlSession的创建细节，程序员不想关注
        // 此时可以将SqlSession交给专业的Factory去生产

        SqlSession sqlSession = sqlSessionFactory.openSqlSession();
        String statementId = "test" + "." + "findUserById";
        User user = new User();
        user.setId(1);
        // user.setUsername("王五");

        List<User> users = sqlSession.selectList(statementId, user);

        System.out.println(users);

    }

}
