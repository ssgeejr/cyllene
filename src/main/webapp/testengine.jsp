<%@ page language="java" %>
<%@ page import="java.util.*" %>
<%@ page import="java.io.*" %>
<%
    String testId = request.getParameter("testid");
    
%>
<!DOCTYPE html>
<html>
<head>
    <title>Frogman Diving</title>
</head>
<body>
    
    <h1>Test Results for <%= testId %></h1>
    <p>Here are the results for test <%= testId %>:</p>
        
</body>
</html>