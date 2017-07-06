package com.itheima.content;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TextServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//设置response查询的码表
		//response.setCharacterEncoding("UTF-8");
		
		//可以只使用使用下面这种方法，通过一个头 Content-type 告诉客户端使用的解码方式（同时也会设置response查询的码表）
		//response.setHeader("Content-type", "text/html;charset=UTF-8");
		//等价的方法
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter writer = response.getWriter();
		//writer.write("hello TextServlet!!!");
		
		writer.write("你好，中国");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

	}
}
