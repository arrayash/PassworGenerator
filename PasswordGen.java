import java.util.Random;

public class PasswordGen {
    public static String generate(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
        Random r = new Random();
        StringBuilder pass = new StringBuilder();

        for (int i = 0; i < length; i++) {
            pass.append(chars.charAt(r.nextInt(chars.length())));
        }

        return pass.toString();
    }

    public static void main(String[] args) {
        System.out.println(generate(6));
    }
}