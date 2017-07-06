package com.itheima.header;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RefreshServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RefreshServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//设置定时刷新的头 (5秒钟之后，刷新定向到baidu)
		response.setHeader("refresh", "5;url=http://www.baidu.com");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

	}
}
