package com.haizhang.servlet;

import com.haizhang.bean.Flower;
import com.haizhang.service.FlowerService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.http.HttpRequest;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.servlet.http.*;
@WebServlet({"/show.do"})
public class ShowServlet extends BaseServlet{
    public String insertFlower(HttpServletRequest request, HttpServletResponse response){
            String name=request.getParameter("name");
            double price=Double.parseDouble(request.getParameter("price"));
            String production=request.getParameter("production");
            FlowerService flowerService=new FlowerService();
            flowerService.insertFlower(name,price,production);
            return "index.jsp";
    }
}
