<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Movimientos de Inventario</title>
</head>
<body>
<h1>Movimientos</h1>

<c:if test="${empty inventoryMovements}">
    <p>No hay movimientos registrados.</p>
</c:if>

<c:if test="${not empty inventoryMovementList}">
    <table border="1">
        <tr><th>ID</th><th>Tipo</th><th>Cantidad</th><th>Fecha</th></tr>
        <c:forEach var="m" items="${inventoryMovementList}">
            <tr>
                <td>${m.productId}</td>
                <td>${m.type}</td>
                <td>${m.quantity}</td>
                <td>${m.movementDate}</td>
            </tr>
        </c:forEach>
    </table>
</c:if>

<p><a href="index.jsp">Volver</a></p>
</body>
</html>
