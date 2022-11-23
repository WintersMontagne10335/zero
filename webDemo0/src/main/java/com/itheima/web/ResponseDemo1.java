package com.itheima.web;

import org.apache.commons.io.IOUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/ResponseDemo1")
public class ResponseDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Winters\\Desktop\\R-C.jfif");
        ServletOutputStream os = response.getOutputStream();
//        byte[] buff = new byte[1024];
//        int len =0;
//        while((len = fis.read(buff))!=-1){
//            os.write(buff,0,len);
//        }
        IOUtils.copy(fis,os);
        fis.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
