<%-- 
    Document   : outcome
    Created on : 15 Apr 2024, 3:39:53 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Outcome Page</title>
    </head>
    <body>
        <h1>Outcome</h1>
        <%
            String num = (String)request.getAttribute("numStr");
            Integer reverseForm = (Integer)request.getAttribute("reverseForm");
            Boolean outcome = (Boolean)request.getAttribute("outcome");
        %>
        <p>
            Below is the outcome
        </p>
        <table>
            <tr>
                <td>Entered number: <b><%=num%></b></td>
            </tr>
            <tr>
                <td>Reverse form: <b><%=reverseForm%></b></td>
            </tr>
            <tr>
                <td>Is number a palindrome? <b><%=outcome%></b></td>
            </tr>
        </table>
            
        <p>
            Please click <a href="enter_num.html">here</a> to enter another number or <a href="view_summary.jsp">here</a> to view summary.
        </p>
    </body>
</html>
