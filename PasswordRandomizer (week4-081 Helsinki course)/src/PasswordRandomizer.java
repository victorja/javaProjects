import java.util.Random;

public class PasswordRandomizer {
    private final int length;
    private Random random = new Random();
    private String symbol = "abcdefghijklmnopqrstuvwxyz";
    
    // Define the variables

    public PasswordRandomizer(int length) {
        this.length = length;
    }

    public String createPassword() {
        String password = "";
        
        for(int x = 0; x < length; x++)
            password+=symbol.charAt(random.nextInt(symbol.length()));

        return password;
    }
}


