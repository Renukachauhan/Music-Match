<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Music Match</title>
</head>
<body>
<%@include file="Header.jsp" %>
<br>
<br>
<form class="form-horizontal" role="form">
<h1><center>Supplier Details</center></h1>
<div class="form-group">
<label for=supplierId" class="control-label col-sm-2">
Supplier_Id:
</label>
<div class="col-sm-10">
<input type="number"  class="form-control" id="supplierId" />
</div>

<label for=name" class="control-label col-sm-2">
Name:
</label>
<div class="col-sm-10">
<input type="text" class="form-control" id="name" />
</div>

<label for=phoneno" class="control-label col-sm-2">
Phone_No:
</label>
<div class="col-sm-10">
<input type="number"  class="form-control" id="phoneno" />
</div>

<label for=email" class="control-label col-sm-2">
EMail_Id:
</label>
<div class="col-sm-10">
<input type="text" class="form-control" id="email" />
</div>

<label for=address" class="control-label col-sm-2">
Address:
</label>
<div class="col-sm-10">
<input type="text" class="form-control" id="address" />
</div>

</div>

<%@include file="Footer.jsp" %>
</body>
</html>