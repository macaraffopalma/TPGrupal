<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Productos</title>
</head>
<body>
<h1>Listado de Productos</h1>

<c:if test="${empty productos}">
    <p>No hay productos disponibles.</p>
</c:if>

<c:if test="${not empty productos}">
    <table border="1">
        <tr>
            <th>ID</th><th>Nombre</th><th>SKU</th><th>Unidad</th><th>Costo</th>
            <th>Venta</th><th>Categoría</th><th>Ubicación</th><th>Activo</th><th>Stock</th>
        </tr>
        <c:forEach var="p" items="${productos}">
            <tr>
                <td>${p.productId}</td>
                <td>${p.productName}</td>
                <td>${p.sku}</td>
                <td>${p.unitOfMeasure}</td>
                <td>${p.cost}</td>
                <td>${p.salePrice}</td>
                <td>${p.category}</td>
                <td>${p.location}</td>
                <td>${p.active}</td>
                <td>${p.stock}</td>
            </tr>
        </c:forEach>
    </table>
</c:if>

<p><a href="index.jsp">Volver</a></p>
</body>
</html>
