package HomeWork_4;

public class TriangleDraw {
    public void drawing_t() {
        String a0 = "* ";
        String a1 = "* ";
        String a2 = "* ";
        String a3 = "* ";
        String a4 = "* ";

        for (int i = 0; i < 5; i++) {
            System.out.println("");
            if (i == 4) {
                for (int a = 0; a < 5; a++) {
                    System.out.println(a0 + a1 + a2 + a3 + a4);
                }
            } else if (i == 0) {
                a0 = "  ";
                a1 = "  ";
                a4 = "  ";
                a3 = "  ";
                System.out.println(a0 + a1 + a2 + a3 + a4);
            } else if (i == 1) {
                a1 = "  ";
                a4 = "  ";
                a3 = "  ";
                System.out.println(a0 + a1 + a2 + a3 + a4);
            }
        }
    }
}