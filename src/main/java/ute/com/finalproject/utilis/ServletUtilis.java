package ute.com.finalproject.utilis;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import java.io.IOException;

public class ServletUtilis {
    public static void forward(String url,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd= request.getRequestDispatcher(url);
        rd.forward(request,response);
    }


}
