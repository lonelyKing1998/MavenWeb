package com.haizhang.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@WebServlet({"/BaseServlet","/baseServlet"})
public class BaseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String path="";
        String action=request.getParameter("action");
        System.out.println(action);
        Class clazz=this.getClass();
        try {

            Method m=clazz.getMethod(action,HttpServletRequest .class,HttpServletResponse.class);
            if(m!=null){
                path=(String)m.invoke(this,request,response);
                if(path != null) {
                    //根据调用方法的返回值，请求转发到指定界面
                    request.getRequestDispatcher(path).forward(request, response);
                }
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
