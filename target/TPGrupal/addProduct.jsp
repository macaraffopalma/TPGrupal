<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Agregar Producto</title>
</head>
<body>
<h1>Agregar Producto</h1>

<html:form action="/addProduct">
    <p>ID Producto: <html:text property="productId"/></p>
    <p>Nombre: <html:text property="productName"/></p>
    <p>SKU: <html:text property="sku"/></p>
    <p>Unidad de medida: <html:text property="unitOfMeasure"/></p>
    <p>Costo: <html:text property="cost"/></p>
    <p>Precio de venta: <html:text property="salePrice"/></p>
    <p>Categoría: <html:text property="category"/></p>
    <p>Ubicación: <html:text property="location"/></p>
    <p>Activo: <html:checkbox property="active"/></p>
    <p>Stock inicial: <html:text property="stock"/></p>

    <html:submit value="Agregar"/>
</html:form>

<p><a href="index.jsp">Volver al inicio</a></p>
</body>
</html>
