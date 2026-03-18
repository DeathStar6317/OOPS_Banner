public class UC7 {

    // Static inner class to store character and pattern
    static class CharacterPattern {
        char character;
        String[] pattern;

        CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Creating character-pattern mappings
        CharacterPattern O = new CharacterPattern('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        // Word to display
        CharacterPattern[] word = {O, O, P, S};

        // Print banner line by line
        for (int i = 0; i < 5; i++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPattern cp : word) {
                line.append(cp.getPattern()[i]).append("  ");
            }

            System.out.println(line);
        }
    }
}