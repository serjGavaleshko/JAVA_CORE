public class FrameDraw {
    public void drawing_f() {

        for (int i = 0; i < 5; i++) {
            if (i == 0 || i == 4) {
                for (int l = 0; l < 5; l++) {
                    System.out.print("*");
                }
                System.out.println("");

            } else if (i == 1 || i == 2 || i == 3) {
                for (int e = 0; e < 6; e++) {
                    if (e == 0 || e == 4) {
                        System.out.print("*");

                    } else if (e == 5)
                        System.out.println("");
                    else
                        System.out.print(" ");


                }
            }
        }
    }

}
