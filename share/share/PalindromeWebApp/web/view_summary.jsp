<%-- 
    Document   : view_summary
    Created on : 15 Apr 2024, 3:51:27 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Summary Page</title>
    </head>
    <body>
        <h1>View summary</h1>
        <%
            Integer totNumsChecked = (Integer)session.getAttribute("totNumsChecked");
            Integer numPalindromes = (Integer)session.getAttribute("numPalindromes");
            Integer numNonPalindromes = (Integer)session.getAttribute("numNonPalindromes");
        %>
        <p>
            Below is the summary
        </p>
        <table>
            <tr>
                <td>Numbers checked: <b><%=totNumsChecked%></b></td>
            </tr>
            <tr>
                <td>Number of palindromes: <b><%=numPalindromes%></b></td>
            </tr>
            <tr>
                <td>Number of non-palindromes: <b><%=numNonPalindromes%></b></td>
            </tr>
        </table>
            
        <p>
            Please click <a href="enter_num.html">here</a> to enter another number or <a href="database_menu.html">here</a> to logout.
        </p>

    </body>
</html>
