public class UC6 {

    // Pattern for letter O
    static String[] getO() {
        return new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };
    }

    // Pattern for letter P
    static String[] getP() {
        return new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        };
    }

    // Pattern for letter S
    static String[] getS() {
        return new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        };
    }

    public static void main(String[] args) {

        String[] O1 = getO();
        String[] O2 = getO();
        String[] P = getP();
        String[] S = getS();

        // Print banner line by line
        for (int i = 0; i < O1.length; i++) {
            System.out.println(O1[i] + "  " + O2[i] + "  " + P[i] + "  " + S[i]);
        }
    }
}