package com.njj.controller;

import com.njj.bean.User;
import com.njj.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Update1Servlet",urlPatterns = "/Update1Servlet")
public class Update1Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
       /* String id           =req.getParameter("id");
        System.out.println("id = " + id);*/
        String username     =req.getParameter("username");
        String real_name    =req.getParameter("real_name");
        String password     =req.getParameter("password");
        String type         =req.getParameter("type");
        String img          =req.getParameter("img");
        String is_del       =req.getParameter("is_del");
        String create_time  =req.getParameter("create_time");
        String modify_time  =req.getParameter("modify_time");
        int typee=(is_del=="是"?1:2);
       // int i1 = Integer.parseInt(id);
        int i11 = Integer.parseInt(type);
        System.out.println("i11 = " + i11);
       // System.out.println("i1 = " + i1);
        System.out.println("type = " + type);
        System.out.println("typee = " + typee);
        User user = new User();
        UserDao userDao = new UserDao();
       // user.setId(i1);
        user.setUsername(username);
        user.setReal_name(real_name);
        user.setPassword(password);
        user.setType(i11);
        user.setImg(img);
        user.setIs_del(typee);
        user.setCreate_time(create_time);
        user.setModify_time(modify_time);
        System.out.println("user = " + user);
        int i = userDao.updateUser(user);
        System.out.println("提交成功 " + i);

    }
}
