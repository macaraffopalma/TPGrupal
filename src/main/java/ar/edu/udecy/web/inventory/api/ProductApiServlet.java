package ar.edu.udecy.web.inventory.api;

import ar.edu.udecy.web.inventory.dao.ProductDAO;
import ar.edu.udecy.web.inventory.model.Product;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/api/products")
public class ProductApiServlet extends HttpServlet {

    private ProductDAO productDAO = new ProductDAO();
    private Gson gson = new Gson();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        List<Product> productos = productDAO.getAllProducts();
        String json = gson.toJson(productos);
        resp.setContentType("application/json");
        resp.getWriter().write(json);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        BufferedReader reader = req.getReader();
        Product nuevoProducto = gson.fromJson(reader, Product.class);
        productDAO.addProduct(nuevoProducto);
        resp.setContentType("application/json");
        resp.setStatus(HttpServletResponse.SC_CREATED);
        resp.getWriter().write("{\"message\":\"Producto creado con éxito\"}");
    }
}
