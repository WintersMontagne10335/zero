package com.itheima.web;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/demo0")
public class ServletDemo0 implements Servlet {
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    //获取ServletConfig对象
    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Servlet");
    }

    //获取Servlet信息
    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
}
