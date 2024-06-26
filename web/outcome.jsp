<%-- 
    Document   : outcome
    Created on : 21 Feb 2024, 4:09:10 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Rock Paper Scissor Outcome Page</title>
    </head>
    <body>
        <h1>Rock Paper Scissor Outcome</h1>
        <%
            String playerName = pageContext.getServletContext().getInitParameter("player_name");
            String computerName = pageContext.getServletContext().getInitParameter("computer_name");
            Character playerChoice = (Character)request.getAttribute("playerChoice");
            Character computerChoice = (Character)request.getAttribute("computerChoice");
            
        %>
        <p>
            Below is the game outcome:
        </p>
        <table>
            <tr>
                <td><b><%=playerName%></b>: </td>
                 <td><%=playerChoice%></td>
            </tr>
            <tr>
                <td><b><%=computerName%></b>: </td>
                 <td><%=playerChoice%></td>
            </tr>
        </table>
            <p>
                Please click <a href="index.html">here</a> to go back to the main page or 
                <a href="start.jsp">here</a> to continue playing.
            </p>
    </body>
</html>
