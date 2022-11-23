package com.itheima.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ResponseDemo0")
public class ResponseDemo0 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        //通过Response对象获取字符输出流
        PrintWriter writer = response.getWriter();
        //写数据
//        response.setHeader("content-type","text/html");
        writer.write("aaa");
        writer.write("<h1>bbb</h1>");
        //writer不需要手动关闭，等response被销毁时会自动关闭
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
