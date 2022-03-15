package ute.com.finalproject.controller;

import ute.com.finalproject.utilis.ServletUtilis;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "HomeServlet", value = "/Home/*")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path= request.getPathInfo();
        switch (path)
        {
            case "/Index":
                ServletUtilis.forward("/View/vwHome/Index.jsp",request,response);
                break;
            case "/About":
                break;
            default: break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
