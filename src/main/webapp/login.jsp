<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Login - TPGrupal</title>
    <style>
        body {
            font-family: Arial;
            background-color: #f4f4f4;
        }
        .login-container {
            width: 300px;
            margin: 100px auto;
            padding: 25px;
            background-color: white;
            border-radius: 8px;
            box-shadow: 0 0 10px gray;
        }
        input[type="text"], input[type="password"] {
            width: 100%;
            padding: 8px;
            margin: 10px 0;
        }
        input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #4CAF50;
            border: none;
            color: white;
            font-weight: bold;
            cursor: pointer;
        }
        .error {
            color: red;
            font-size: 12px;
        }
    </style>
</head>
<body>
<div class="login-container">
    <h2>Ingreso al sistema</h2>
    <form action="login.do" method="post">
        Usuario: <input type="text" name="username"><br>
        Contraseña: <input type="password" name="password"><br>
        <input type="submit" value="Ingresar">
        <div class="error">${errorMessage}</div>
    </form>
</div>
</body>
</html>
