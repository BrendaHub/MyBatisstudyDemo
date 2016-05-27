package com.mybatis.service.impl;

import java.util.List;

import com.mybatis.bean.Message;
import com.mybatis.dao.MessageDao;
import com.mybatis.service.MessageInterfacle;

public class Messageimpl implements MessageInterfacle {

	public List<Message> findList() {
		MessageDao messageDao = new MessageDao();
		return messageDao.findList();
	}

}
