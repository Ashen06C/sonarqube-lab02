package main.java.com.example;

public class App {

    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(App.class.getName());

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        LOGGER.info(() -> String.valueOf(calc.calculate(10, 5, "add")));

        UserService service = new UserService();
        try {
            service.findUser("admin");
            service.deleteUser("admin");
        } catch (Exception e) {
            LOGGER.log(java.util.logging.Level.SEVERE, "Error in UserService", e);
        }
    }
}