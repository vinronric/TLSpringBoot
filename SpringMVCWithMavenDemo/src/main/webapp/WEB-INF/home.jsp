<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
    <b>Addition</b>
    <form action="add" method="post">
	    <Table border="1">
	       <tr><td>Enter First Number : </td><td><input type="text" name="t1"></td></tr>
	       <tr><td>Enter Second Number : </td><td><input type="text" name="t2"></td></tr>
	       <Tr><td><input type="submit"></td></Tr>
	    </Table>
    </form>
        <br></br>
    <b>devide</b>
    <form action="devide" method="post">
	    <Table border="1">
	       <tr><td>Enter First Number : </td><td><input type="text" name="t1"></td></tr>
	       <tr><td>Enter Second Number : </td><td><input type="text" name="t2"></td></tr>
	       <Tr><td><input type="submit"></td></Tr>
	    </Table>
    </form>
    <br></br>
     <b>Alien User - Addition</b>
    <form action="addAlien" method="post">
	    <Table border="1">
	       <tr><td>Alien ID : </td><td><input type="text" name="alienId"></td></tr>
	       <tr><td>Alien Name : </td><td><input type="text" name="alienName"></td></tr>
	       <tr><td>Alien Age : </td><td><input type="text" name="alienAge"></td></tr>
	       <Tr><td><input type="submit"></td></Tr>
	    </Table>
    </form>
</body>
</html>