package java112.project3;

import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

/**
 *
 *
 *@author   Qiao
 */
@WebServlet(
    name = "MVCTeam",
    urlPatterns = { "/mvcChallenge" }
)

public class MVCTeam extends HttpServlet {

    /**
     *  Handles HTTP GET requests.
     *
     *@param  request               the HttpRequest
     *@param  response              the HttpResponse
     *@exception  ServletException  if there is a general
     *                              servlet exception
     *@exception  IOException       if there is a general
     *                              I/O exception
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

           // response.setContentType("html");

           // PrintWriter out = response.getWriter();
            

            List<String> employeeName = new ArrayList<String>();
            List<String> employeeId = new ArrayList<String>();
            List<String> employeeSalary = new ArrayList<String>();
            
            // employeeName =  new Employee();
           // Employee employeeId = new Employee();
            //Employee employeeSalary = new Employee();
            
            // Adding 3 elements to the employee tree set
            employeeName.add("Tina");
            employeeName.add("Jim");
            employeeName.add("Mark");
            
            employeeId.add("1");
            employeeId.add("2");
            employeeId.add("3");
              
            employeeSalary.add("100000");
            employeeSalary.add("90000");
            employeeSalary.add("80000");  
            
            MVCBean myBean = new MVCBean();
            
            for (String list : employeeName) {
              
                //out.print(list);
                myBean.setName(list);
                request.setAttribute("coolBeanOne", myBean);
            }
            
            for (String list : employeeId) {
                
                myBean.setId(list);
                request.setAttribute("coolBeanTwo", myBean);
            }
            
            for (String list : employeeSalary) {
                
                myBean.setSalary(list);
                request.setAttribute("coolBeanThree", myBean);
            }
            

            
            String url = "/yeaTeam.jsp";
            
            RequestDispatcher  dispatcher =
                    getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);
            
        }

}
