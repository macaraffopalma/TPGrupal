package ar.edu.udecy.web.inventory.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.lang.reflect.Type;
import java.util.Objects;

public class JsonDB {

    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static <T> T read(String filePath, Type type) {
        try (Reader reader = new InputStreamReader(
                Objects.requireNonNull(JsonDB.class.getClassLoader().getResourceAsStream("data/" + filePath)), "UTF-8")) {
            return gson.fromJson(reader, type);
        } catch (Exception e) {
            System.err.println("❌ Error leyendo JSON: " + filePath + " → " + e.getMessage());
            return null;
        }
    }

    public static <T> void write(String filePath, T data) {
        try {
            File file = new File("src/main/resources/data/" + filePath);
            file.getParentFile().mkdirs();

            try (Writer writer = new OutputStreamWriter(new FileOutputStream(file), "UTF-8")) {
                gson.toJson(data, writer);
            }
        } catch (Exception e) {
            System.err.println("❌ Error escribiendo JSON: " + filePath + " → " + e.getMessage());
        }
    }
}
