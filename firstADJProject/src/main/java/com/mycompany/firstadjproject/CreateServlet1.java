/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstadjproject;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 *
 * @author dhana
 */
public class CreateServlet1 implements Servlet{
    ServletConfig conf;

    @Override
    public void init(ServletConfig conf){
            this.conf = conf;
            System.out.print("Creating Object:...");
    }

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
       System.out.print("Servicing......");
       resp.setContentType("text/html");
       PrintWriter out = resp.getWriter();
       out.print("<h1>Hello Dhananjay</h1><br>");
              out.print("<h1>Today's Date is : </h1>"+new Date().toString());

    }
    
    
    @Override
    public void destroy() {
       System.out.print("Going to destroy object");
    }
    
    
    
    @Override
    public ServletConfig getServletConfig() {
       return this.conf;
    }

    @Override
    public String getServletInfo() {
        return "This servlet is created by Dhananjay";
    }

    
    
}
