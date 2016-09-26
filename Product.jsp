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
<h1><center>Product Details</center></h1>
<div style="text-align: center; background-color:#FFFFFF;">
	<div style="box-sizing: border-box; display: inline-block; width: auto;max-width: 600px; background-color: #FFFFFF; border: 2px solid #FFFFFF; border-radius: 5px; box-shadow: 0px 0px 8px #FFFFFF; margin: 40px auto auto;">
	<div style="background:#FFFFFF ; padding: 15px">
<form class="form-horizontal" role="form">
<div class="form-group">
<label for=productid" class="control-label col-sm-2">
Product_Id:
</label>
<div class="col-sm-10">
<input type="number"  class="form-control" id="productid" />
</div>

<label for=productname" class="control-label col-sm-2">
ProductName:
</label>
<div class="col-sm-10">
<input type="text" class="form-control" id="productname" />
</div>


<label for=category" class="control-label col-sm-2">
Category:
</label>
<div class="col-sm-10">
<input type="text" class="form-control" id="category" />
</div>

<label for=SupplierId" class="control-label col-sm-2">
SupplierId:
</label>
<div class="col-sm-10">
<input type="number" class="form-control" id="SupplierId" />
</div>

<label for=Description" class="control-label col-sm-2">
Description:
</label>
<div class="col-sm-10">
<input type="text" class="form-control" id="Description" />
</div>

<label for=Price" class="control-label col-sm-2">
Price:
</label>
<div class="col-sm-10">
<input type="number"  class="form-control" id="Price" />
</div>

<label for=Quantity" class="control-label col-sm-2">
Quantity:
</label>
<div class="col-sm-10">
<input type="number"  class="form-control" id="Quantity" />
</div>


</form>
</div>
</div></div>
<%@include file="Footer.jsp" %>

</body>
</html>