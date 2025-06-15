<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Stock Actual</title>
</head>
<body>
<h1>Stock Actual</h1>

<c:if test="${empty currentStockList}">
    <p>No hay datos de stock disponibles.</p>
</c:if>

<c:if test="${not empty currentStockList}">
    <table border="1">
        <tr><th>ID</th><th>Cantidad</th><th>Actualizado</th><th>Costo Total</th></tr>
        <c:forEach var="s" items="${currentStockList}">
            <tr>
                <td>${s.productId}</td>
                <td>${s.quantity}</td>
                <td>${s.lastUpdated}</td>
                <td>${s.totalInventoryCost}</td>
            </tr>
        </c:forEach>
    </table>
</c:if>

<p><a href="index.jsp">Volver</a></p>
</body>
</html>
