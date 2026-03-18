import java.util.HashMap;
import java.util.Map;

public class UC8 {

    // Map to store character patterns
    static Map<Character, String[]> patternMap = new HashMap<>();

    // Initialize patterns
    static void initializePatterns() {

        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });
    }

    // Function to render banner
    static void renderBanner(String word) {

        int height = patternMap.get('O').length;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {
                String[] pattern = patternMap.get(c);
                line.append(pattern[i]).append("  ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        initializePatterns();

        String word = "OOPS";

        renderBanner(word);
    }
}