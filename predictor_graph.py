import json
import matplotlib.pyplot as plt
from datetime import datetime

# Ruta al archivo JSON
FILE_PATH = "src/main/resources/data/predictor_stock.json"

# Leer datos
with open(FILE_PATH, "r", encoding="utf-8") as f:
    data = json.load(f)

# Ordenar por fecha
data.sort(key=lambda x: datetime.strptime(x["date"], "%Y-%m-%d"))

# Extraer datos
fechas = [x["date"] for x in data]
unidades = [x["unitsSold"] for x in data]

# Graficar
plt.figure(figsize=(10, 5))
plt.plot(fechas, unidades, marker="o")
plt.title("📈 Unidades Vendidas - Historial")
plt.xlabel("Fecha")
plt.ylabel("Unidades Vendidas")
plt.xticks(rotation=45)
plt.grid(True)
plt.tight_layout()

# Guardar gráfico
plt.savefig("src/main/webapp/predictor_output.png")
print("✅ Gráfico guardado como predictor_output.png")
