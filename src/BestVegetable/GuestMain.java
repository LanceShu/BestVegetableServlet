package BestVegetable;

import Service.GuestUtil;
import Service.ProductUtils;
import sun.rmi.runtime.Log;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "guest",urlPatterns = "/guest")
public class GuestMain extends HttpServlet{

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");

        PrintWriter pw = response.getWriter();

        /**
         * 获取用户的账号与密码;
         * */
        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");

        /**
         * 验证用户的账号密码是否正确;
         * */
        GuestUtil.findUserByName(name,pwd,pw);

    }
}
