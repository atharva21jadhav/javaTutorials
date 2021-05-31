<%-- 
    Document   : index
    Created on : 31 May, 2021, 3:02:28 PM
    Author     : atharva-pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2 style="text-align:center;">Assignment 5 </h2>
        <h4 style="text-align:center;">Atharva Jadhav - BEIT129</h4>
        <br>
        <form action="index.jsp" style="text-align:center;">
            
            <input type="text" name="First Number"><!-- comment -->
            <br><!-- comment -->
            <input type="text" name="Second Number"><!-- comment -->
            <br><!-- comment -->
            <input type="submit" name="Add"><!-- comment -->
        </form>
        <hr><!-- comment -->
        <%
        try{
           addition.Addition_Service  service = new addition.Addition_Service();
           addition.Addition port = service.getAdditionPort();
           
           String a = request.getParameter("First Number");
           String b = request.getParameter("Second Number");
           
           int num1 = Integer.parseInt(a);
           int num2 = Integer.parseInt(b);
           
           java.lang.Integer result = port.addition(num1, num2);
           out.println("Addition of"+a+" and "+b+" = "+result);
           
        }catch(Exception e){
            //TO DO :Handle Exception here..
        }
        %>
        <hr/>
    </body>
</html>
