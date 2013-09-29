<%@page contentType="text/html; charset=GBK"%>
<html>
<head>
	<title>Spring¡¢Struts¡¢ºÍHibernateÕûºÏ</title>
</head>
<body> ${msg}
	<from name="user" action="/myHib/regedit.action" method="post">
		Username <input type="text" name="user.name" value="${user.username}"/><br>
		Password <input type="password" name="User.password" value="${user.password}"/><br>
		<input type="submit" name="method" value="Submit" />
	</from>
</body>
</html>