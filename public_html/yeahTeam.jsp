<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2//EN">

<html>
  <head>
    <meta name="generator" content="HTML Tidy, see www.w3.org">
    <link rel="stylesheet" href="/java112/css/yeahTeam.css" type="text/css" />
                   
    <title>Yeah! Team</title>
  </head>

  <body>
    <h2>Yeah Team!</h2>

    <h3>Yeah Team Annual Salary: </h3>
    
    <table>
      <tr>
        <th>Employee Name</th>
        <th>Employee ID</th>
        <th>Employee Salary</th>
      </tr>
    
      <tr>
        <td>${yeahTeamBean.getNameList()[0]}</td>
        <td>${yeahTeamBean.getIdList()[0]}</td>
        <td>${yeahTeamBean.getSalaryList()[0]}</td>
      </tr>
      
      <tr>
        <td>${yeahTeamBean.getNameList()[1]}</td>
        <td>${yeahTeamBean.getIdList()[1]}</td>
        <td>${yeahTeamBean.getSalaryList()[1]}</td>
      </tr>      

      <tr>
        <td>${yeahTeamBean.getNameList()[2]}</td>
        <td>${yeahTeamBean.getIdList()[2]}</td>
        <td>${yeahTeamBean.getSalaryList()[2]}</td>
      </tr>           

    </table>



    <br />

    <a href="/java112/yeaTeamHome.jsp">Take me home</a>
    
    </body>

  
    <br />
    
    <a href="/java112/mvcPic.jsp">Home</a>

  </body>

</html>