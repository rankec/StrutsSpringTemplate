<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<h1>Register your account</h1>
<s:form action="register">
    <s:textfield name="username" label="Username"/>
    <s:textfield name="password" label="Password" type="password"/>
    <s:submit value="Send"/>
</s:form>
</body>
</html>
