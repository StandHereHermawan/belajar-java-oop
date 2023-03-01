package programmer.zaman.now.application;

import programmer.zaman.now.annotation.Fancy;
import programmer.zaman.now.data.LoginRequest;
import programmer.zaman.now.error.ValidationException;
import programmer.zaman.now.util.ValidationUtil;

public class ValidationApp {

    @Fancy(name = "ValidationApp", tags = {"application", "java"})
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("Arief", "Rahasia");

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        } catch (ValidationException | NullPointerException | IllegalArgumentException exception) {
            System.out.println("Data tidak valid: " + exception.getMessage());
        } finally {
            System.out.println("Selalu di eksekusi");
        }

        LoginRequest loginRequest2 = new LoginRequest(null,null);
        ValidationUtil.validateRunTime(loginRequest2);
    }
}