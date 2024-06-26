<%-- 
    Document   : start
    Created on : 21 Feb 2024, 3:29:57 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Start Page</title>
    </head>
    <body>
        <h1>Start</h1>
        
        <%
            String playerName = pageContext.getServletContext().getInitParameter("player_name");
            String computerName = pageContext.getServletContext().getInitParameter("computer_name");
        %>
        <p>
            Hi <b><%=playerName%></b>. My name is <b><%=computerName%></b>, your play mate. Let's start the game.
        </p>
        
        <form action="RockPaperScissorServlet.do" method="POST">
            <table>
                <tr>
                    <td>Make a choice:</td>
                    <td>
                       <select name=choice"" required="">
                        <option value="R">Rock</option>
                        <option value="P">Paper</option>
                        <option value="S">Scissor</option>
                      </select>
                    </td>               
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="PLAY"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
