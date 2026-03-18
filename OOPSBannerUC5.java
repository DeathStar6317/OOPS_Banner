public class OOPSBannerUC5 {

    public static void main(String[] args) {

        String gap = "   ";

        // Array declaration + initialization in single statement
        String[] banner = {
                String.join(gap,
                        " ***** ",
                        " ***** ",
                        " ***** ",
                        " ***** "),

                String.join(gap,
                        "*     *",
                        "*     *",
                        "*     *",
                        "*      "),

                String.join(gap,
                        "*     *",
                        "*     *",
                        " ***** ",
                        " ***** "),

                String.join(gap,
                        "*     *",
                        "*     *",
                        "*      ",
                        "      *"),

                String.join(gap,
                        " ***** ",
                        " ***** ",
                        "*      ",
                        " ***** ")
        };

        // Enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}