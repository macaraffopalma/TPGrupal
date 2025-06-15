<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>TPGrupal - Sistema de Inventario</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f9f9f9;
            padding: 40px;
        }
        h1 {
            color: #333;
        }
        ul {
            list-style: none;
            padding-left: 0;
        }
        li {
            margin: 10px 0;
        }
        a {
            text-decoration: none;
            color: #007bff;
            font-size: 18px;
        }
        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>

<h1>📦 Sistema de Gestión de Inventario - TPGrupal</h1>

<ul>
    <li><a href="productList.do">📋 Ver Productos</a></li>
    <li><a href="addProduct.jsp">➕ Agregar Producto</a></li>
    <li><a href="currentStockList.do">📦 Stock Actual</a></li>
    <li><a href="inventoryMovements.do">🔄 Movimientos de Inventario</a></li>
    <li><a href="predictorStockList.do">📈 Vista de Predicción</a></li>
    <li><a href="predictorGraph.jsp">🧠 Gráfico de Predicción</a></li>
</ul>

</body>
</html>
