import java.util.*;

public class BannerUC4 {

    public static void main(String[] args) {

        // Banner stored in array
        String[] banner = {
            String.join("", "* * * * * * * * * *"),
            String.join("", "*                 *"),
            String.join("", "*   OOPS BANNER    *"),
            String.join("", "*      UC4         *"),
            String.join("", "*                 *"),
            String.join("", "* * * * * * * * * *")
        };

        // Printing banner using enhanced for loop
        for(String line : banner) {
            System.out.println(line);
        }
    }
}