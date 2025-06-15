package ar.edu.udecy.web.inventory.util;

public class LoginValidator {

    public static boolean isValid(String username, String password) {
        return "Admin".equals(username) && "Admin123".equals(password);
    }
}
