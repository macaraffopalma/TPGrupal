<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Alta de Producto (API REST)</title>
</head>
<body>
<h2>Alta de Producto vía API REST</h2>
<form id="productForm">
    <label>ID:</label> <input type="text" name="productId"><br>
    <label>Nombre:</label> <input type="text" name="productName"><br>
    <label>SKU:</label> <input type="text" name="sku"><br>
    <label>Unidad:</label> <input type="text" name="unitOfMeasure"><br>
    <label>Costo:</label> <input type="number" name="cost"><br>
    <label>Precio Venta:</label> <input type="number" name="salePrice"><br>
    <label>Categoria:</label> <input type="text" name="category"><br>
    <label>Ubicacion:</label> <input type="text" name="location"><br>
    <label>Activo:</label> <input type="checkbox" name="active"><br>
    <label>Stock:</label> <input type="number" name="stock"><br>
    <button type="submit">Guardar</button>
</form>

<script>
document.getElementById('productForm').addEventListener('submit', function (e) {
    e.preventDefault();
    const data = Object.fromEntries(new FormData(this).entries());
    data.active = this.active.checked;
    fetch('/TPGrupal/api/products', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(data)
    }).then(res => {
        if (res.ok) {
            alert('Producto agregado con éxito');
            this.reset();
        } else {
            alert('Error al guardar');
        }
    });
});
</script>

<p><a href="index.jsp">Volver</a></p>
</body>
</html>
