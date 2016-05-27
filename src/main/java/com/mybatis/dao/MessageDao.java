package com.mybatis.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.bean.Message;
import com.mybatis.db.DBAccess;

/**
 * Message对象的数据访问类
 */
public class MessageDao {

	public List<Message> findList(){
		List<Message> list= new ArrayList<Message>();
		DBAccess dbaccess = new DBAccess();
		SqlSession sqlSession = null;
		try {
			sqlSession = dbaccess.getSqlSession();
			list = sqlSession.selectList("Message.findList");
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(sqlSession != null){
				sqlSession.close();
			}
		}
		return list;
	}
}
