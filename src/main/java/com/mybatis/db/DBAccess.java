package com.mybatis.db;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 加载MyBatis配置文件，创建数据库处理对象，SqlSession
 * @author brenda
 * 
 */
public class DBAccess {

	/**
	 * 用来获取MyBatis处理数据库操作的核心对象SqlSession
	 * @throws IOException 
	 */
	public SqlSession getSqlSession() throws IOException{
		//第一步通过mybatis里内置的Resources来找到相关的配置资 源
		Reader reader = Resources.getResourceAsReader("configs/mybatis-config.xml");
		//第二步获取SqlSessionFactory，对象，需要通过SqlSessionFactoryBuilder来儿取.
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		//第三步，通过SqlSessionFactory获取SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		return sqlSession;
	}
}
