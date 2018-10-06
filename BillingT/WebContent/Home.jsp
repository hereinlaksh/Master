<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home :: Page</title>
<link rel="stylesheet" href="bootstrap-3.3.5-dist/css/bootstrap.css">
<link rel="stylesheet" href="bootstrap-3.3.5-dist/css/bootstrap.min.css">
<link rel="stylesheet" href="bootstrap-3.3.5-dist/css/bootstrap-theme.css">
<link rel="stylesheet" href="bootstrap-3.3.5-dist/css/bootstrap-theme.min.css">
<script type="text/javascript" src="bootstrap-3.3.5-dist/css/bootstrap.js">
</script>
<script type="text/javascript" src="bootstrap-3.3.5-dist/css/bootstrap.min.js">
</script>
<script type="text/javascript">



	

</script>

<style type="text/css">
h1
{
	
	left:10%;
	font-family:serif; 
	font-size:30pt;
	position: relative;
	color:#FF0000;
	text-shadow: 3px 3px 2px #656565, 3px 3px 2px #A5A5A5, 3px 3px 2px #D69999 ;
	
}

#wrap
{
margin: 0 auto;
width: 1000px;
}
p
{
	font-size: 8pt;
	font-style: arial;
	
	}
footer
{
	position: relative;
    
    height: 35px;
    text-align: right;
    padding:20px 1px;
    }
    h3
    {
    	color:#3C444C	;
       	font-size: 20pt;
    }
    body
    {
     background-image: url("images/bgp.jpg"); 
     
    }
    
</style>
</head>
<body>

<div class="container" id="wrap">
<header>
<table>
<tr>
<td>
<div style="position:relative; ; border-width: thin;">
<img alt="logo" src="images/log.jpg" class="img-rounded" width="130" height="130" ></div></td>
<td><h1>CREDENCE&nbsp; LIFE&nbsp; INSURANCE</h1></td>

<td>
<div style="border-right: thin;  padding-top: 60pt; padding-left: 0pt; font-family:gabriola ; "> 
<h3><b>-Building Certitude</b></h3>
</div>
</td>
</tr>
</table>
</header>
</div>
<div id="wrap">
<div align="center">

<form action="loginController" onsubmit="validation()" method="post">

<table>

<tr><td><img src="images/logimg.jpg" alt="sample"  style="padding-left:20pt; padding-top: 40pt;" class="img-circle"></td></tr>

<tr>
<td>
<br>
<input type="text" name="role" size="30" class="form-control " id="1" placeholder="UserName" required="required">
</td></tr>
<tr><td>
<br>
<input type="password" name="pwd"  size="30" class="form-control" id="2" placeholder="Password" required="required">
</td></tr>
<tr><td><br>
<input type="hidden" name="action" value="loginDb">
<input type="submit" class="btn btn-primary btn-lg btn-block" value="Log In"></td></tr>

</table>

</form>




</div>
<footer>

<p><b>Copyright © CREDENCE&nbsp;LIFE&nbsp; INSURANCE</b></P>
</footer>
</div>


</body>
</html>