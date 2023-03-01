package programmer.zaman.now.application;

import programmer.zaman.now.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        try {
            connectDatabase(null, null);
            System.out.println("Sukses");
        } catch (DatabaseError error) {
            System.out.println("Error " + error.getMessage());
        }
    }

    public static void connectDatabase(String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseError("Tidak bisa konek ke database");
        }
    }
}
