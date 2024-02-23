package com.mycompany.fetchingdatafromhtml;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Registration extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        var Name = req.getParameter("Name");
        
        String check = req.getParameter("checkbox");
        if(check!=null){
        out.print("<h1>Welcome to Registration Page "+ Name +"</h1>");
        out.print("Registration Succesfull!");
        
            
        }else{
            out.print("Please Agree The terms and Conditions");
            //To send or include data from another file or to another file have to use Request dispather
            RequestDispatcher rd = req.getRequestDispatcher("index.html");
            //there are two major methods of request dispatcher 
            //1.
            rd.include(req, resp);
            //2.
//            rd.forward(req, resp);
        }
    }
    
    
}
