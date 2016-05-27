package com.mybatis.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mybatis.bean.Message;
import com.mybatis.service.MessageInterfacle;
import com.mybatis.service.impl.Messageimpl;

public class MessageServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		MessageInterfacle message = new Messageimpl();
		List<Message> list = message.findList();
		req.setAttribute("list", list);
		
		req.getRequestDispatcher("/WEB-INF/jsps/back/list.jsp").forward(req, resp);
	}

	
}
