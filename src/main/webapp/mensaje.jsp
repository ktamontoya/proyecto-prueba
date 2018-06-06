<%-- 
    Document   : mensaje
    Created on : 6/06/2018, 04:52:39 PM
    Author     : CATALINA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="../../../../favicon.ico">

        <title>-MENSAJE-</title>

        <!-- Bootstrap core CSS -->
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="${pageContext.servletContext.contextPath}/css/jumbotron.css" rel="stylesheet">
    </head>
    <body>

        <main role="main">

            <!-- Main jumbotron for a primary marketing message or call to action -->
            <div class="jumbotron">
                
                <h1>
                    <c:out value="${sessionScope.MENSAJE}"></c:out>
                    
                    <a href="${pageContext.servletContext.contextPath}/view/menu.jsp">Regresar</a>
                </h1>
            </div>

        </main>

    </body>
</html>