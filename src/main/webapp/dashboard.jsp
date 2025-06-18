<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<%
    String role = (String) session.getAttribute("role");
    if (role == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>
<html>
<head>
    <title>Panel Principal</title>
    <style>
        body {
            margin: 0;
            font-family: Arial, sans-serif;
        }
        .sidebar {
            width: 200px;
            background: #2c3e50;
            color: white;
            height: 100vh;
            position: fixed;
            padding-top: 20px;
        }
        .sidebar a {
            color: white;
            display: block;
            padding: 12px;
            text-decoration: none;
        }
        .sidebar a:hover {
            background: #34495e;
        }
        .main {
            margin-left: 200px;
            padding: 20px;
        }
        iframe {
            width: 100%;
            height: 90vh;
            border: none;
        }
    </style>
</head>
<body>
<div class="sidebar">
    <h3 style="text-align:center;">Menú</h3>

    <a href="productList.do" target="contenido">Productos</a>

    <c:if test="${role == 'Admin' || role == 'Vend'}">
        <a href="currentStockList.do" target="contenido">Stock</a>
        <a href="inventoryMovements.do" target="contenido">Movimientos</a>
    </c:if>

    <c:if test="${role == 'Admin'}">
        <a href="productRestAdd.jsp" target="contenido">Agregar Producto</a>
        <a href="predictorChart.jsp">Gráfico de Predicción</a>
    </c:if>

    <a href="login.jsp">Cerrar Sesión</a>
</div>

<div class="main">
    <iframe name="contenido" src="productList.do"></iframe>
</div>
</body>
</html>
