<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Welcome to hangman!</title>
</head>
<body>
<h1>Welcome to Hangman</h1>

<h2>guess the word</h2>
<s:property value="word"/>


<h2>Your last guess</h2>
<s:property value="guess"/>


<s:form>
    <s:textfield name="guess" labal="Guess:" maxLength="1"/>
    <section hidden="true">
        <s:property value="guesses"/>
    </section>
    <s:submit value="Send"/>
</s:form>


<s:if test="won">
    <h1>You Won! Nice!</h1>

</s:if>

</body>
</html>
