<%--
  Created by IntelliJ IDEA.
  User: davi2
  Date: 11/10/2020
  Time: 23:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Loja</title>
</head>
<body>
    <h1 align="center">Bem-vindo à nossa loja</h1><br>
    <h2>Por favor, faça o login ou inscreva-se já!</h2>
    <h3>Login</h3>
    <form action="" method="post">
        E-mail:<br>
        <input type="text" name="email"><br>
        Senha:<br>
        <input type="password" name="senha"><br><br>
        <input type="submit">
    </form><br><br>
    <h3>Cadastrar</h3>
    <form action="/ServletRedirecter" method="post">
        Nome:<br>
        <input type="text" name="nome"><br>
        E-mail:<br>
        <input type="text" name="email"><br>
        Senha:<br>
        <input type="password" name="senha"><br><br>
        <input type="submit" value="Cadastrar">
    </form>
</body>
</html>
