<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Music Match</title>
</head>
<body style="background-color:#EEEEEE">
<%@include file="Header.jsp" %>
<h1><center>Login</center></h1>
<h3><center><p>Get access to your Orders,Wishlist and Recommendations</p></center></h3>
<br>
<br>
<br>
<br>
<form class="form-horizontal" role="form">
<div class="form-group">
<label for=email" class="control-label col-sm-2">
Email:
</label>
<div class="col-sm-10">
<input type="email" class="form-control" id="email" />
</div>

<label for=password" class="control-label col-sm-2">
Password:
</label>
<div class="col-sm-10">
<input type="Password" class="form-control" id="pwd" />
</div>


<div class="col-sm-offset-2 col-sm-10">
<div class="checkbox">
<label><input type="checkbox"/>stay sign-in</label>
</div></div>

<div class="col-sm-offset-2 col-sm-10">
<button type="submit" class="btn btn=default">Submit</button>
</div><center>
<p class="change_link">
					Not a member yet ?
					<a href="SignUp" class="to_register">Join us</a></center>
				</p>
</div>

<%@include file="Footer.jsp" %>
</body>
</html>