package Classwork_5;

import java.util.Scanner;


public class LoopClaswork {

    public void looper() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a integer: ");
        int a = in.nextInt();
        System.out.print("Input a integer: ");
        int b = in.nextInt();

        if (a > b) {
            while (a > b) {
                a--;
                System.out.println("var a: " + a + " var b: " + b);
                System.out.println();
            }

        } else {
            System.out.println("var a: " + a + " var b: " + b);
                    }
    }
}



