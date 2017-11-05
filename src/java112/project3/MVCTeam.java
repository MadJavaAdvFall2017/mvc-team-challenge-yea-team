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
            

            List<String> employeeNameList = new ArrayList<String>();
            List<Integer> employeeIdList = new ArrayList<Integer>();
            List<Integer> employeeSalaryList = new ArrayList<Integer>();
            
            //Employee employeeName =  new Employee();
            //Employee employeeId = new Employee();
            //Employee employeeSalary = new Employee();
            
            // Adding 3 elements to the employee tree set
            employeeNameList.add("Amy");
            employeeNameList.add("Renee");
            employeeNameList.add("Qiao");
            
            employeeIdList.add(1);
            employeeIdList.add(2);
            employeeIdList.add(3);
              
            employeeSalaryList.add(1300000);
            employeeSalaryList.add(1200000);
            employeeSalaryList.add(990000);  
            
            
            MVCBean ourBean = new MVCBean();
            
            ourBean.setNameList(employeeNameList);
            ourBean.setIdList(employeeIdList);
            ourBean.setSalary(employeeSalaryList);
            
            request.setAttribute("yeahTeamBean", ourBean);
            
            
            String url = "/yeahTeam.jsp";
            
            RequestDispatcher  dispatcher =
                    getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);
            
        }

}
