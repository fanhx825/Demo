<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>用户登录界面</title>
</head>
<body>
	<form action="login.do" method="post">
		<center>
			用户名：
			<input name="username" type="text" />
			<br />
			密&nbsp;&nbsp;码：
			<input name="password" type="password" />
			<br />
			<input name="submit" value="提交" type="submit" />
		</center>
	</form>
</body>
</html>