<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*, com.google.gson.Gson, ar.edu.udecy.web.inventory.dao.PredictorStockDAO, ar.edu.udecy.web.inventory.model.PredictorStock" %>
<%
    PredictorStockDAO dao = new PredictorStockDAO();
    List<PredictorStock> registros = dao.getAll(); // Asegurate que exista
    List<String> fechas = new ArrayList<>();
    List<Integer> unidades = new ArrayList<>();
    for (PredictorStock ps : registros) {
        fechas.add(ps.getDate());         // Asegurate que existan
        unidades.add(ps.getUnitsSold());
    }
    Gson gson = new Gson();
%>
<!DOCTYPE html>
<html>
<head>
    <title>📊 Predicción de Ventas</title>
    <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
</head>
<body>
<h2 style="text-align: center;">Gráfico de Predicción de Unidades Vendidas</h2>
<div style="width: 90%; max-width: 800px; margin: auto;">
    <canvas id="graficoVentas"></canvas>
</div>
<script>
    const labels = <%= gson.toJson(fechas) %>;
    const data = {
        labels: labels,
        datasets: [{
            label: 'Unidades Vendidas',
            data: <%= gson.toJson(unidades) %>,
            fill: false,
            borderColor: 'blue',
            tension: 0.1
        }]
    };
    const config = {
        type: 'line',
        data: data
    };
    new Chart(document.getElementById('graficoVentas'), config);
</script>
</body>
</html>

