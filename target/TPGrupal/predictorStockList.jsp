<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Predicción de Stock</title>
</head>
<body>
<h1>Predicción de Ventas</h1>

<c:if test="${empty predictorStockList}">
    <p>No hay datos de predicción.</p>
</c:if>

<c:if test="${not empty predictorStockList}">
    <table border="1">
        <tr><th>ID Producto</th><th>Últimos 7 días</th></tr>
        <c:forEach var="p" items="${predictorStockList}">
            <tr>
                <td>${p.productId}</td>
                <td>${p.last7DaysSales}</td>
            </tr>
        </c:forEach>
    </table>
</c:if>

<p><a href="index.jsp">Volver</a></p>
</body>
</html>
