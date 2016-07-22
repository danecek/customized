<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page  import="java.util.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add customer</h1>
        <%--
        <jsp:useBean id ="mybean" scope="request"
                     class="edu.customers.model.MyBean">            
        </jsp:useBean>
        <br>
        ${mybean.attr}
        <br>
        <%= new java.util.Date()%>

        <%
            String em = (String) request.getAttribute("errormessage");
            if (em != null) {
                out.print(em);
            }

        %>

        --%>
        <c:if test="${not empty errormessage}">
            ${errormessage}
        </c:if>
       
        <form action="add.do" method="POST">
            <input type="text" name="name" />
            <input type="submit" value="Add customer" />
        </form>
    </body>
</html>
