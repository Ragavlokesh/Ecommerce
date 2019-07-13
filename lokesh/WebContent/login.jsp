<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>regjsp</title>
</head>
<body>
<%@page import="java.sql.*"%>
<%@page import="javax.sql.*"%>
<%



String username=request.getParameter("username");
session.putValue("username",username);
String password=request.getParameter("password");



Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/userlogin","root","1234");
Statement st=con.createStatement();
ResultSet rs;
String sql="insert into login values('"+username+"','"+password+"')";
st.executeUpdate(sql);


out.println("Registered");

%>
<a href="Login.html">Login</a><br/><br/>
<a href="index.html">Home</a>
<a href="Register.html">Register</a><br/><br/>

</body>
</html>