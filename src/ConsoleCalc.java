import java.util.Scanner;

public class ConsoleCalc {


    public void insertion() {

        Scanner in = new Scanner(System.in);
        System.out.print("Input first integer: ");
        int int1 = in.nextInt();
        System.out.print("Input second integer: ");
        int int2 = in.nextInt();
        System.out.print("Input +,-,/,*: ");
        char char1 = in.next().charAt(0);

        in.close();

int result11 = 5;
        if (char1 == '+') {
             result11 = int1 + int2;
        //    System.out.print(result11);
        } else if (char1 == '-') {
            result11 = int1 - int2;
        //    System.out.print(result11);
        } else if (char1 == '*') {
             result11 = int1 * int2;
        //    System.out.print(result11);
        } else if (char1 == '/') {
            result11 = int1 / int2;
         //  System.out.print(result11);
        } else
            System.out.println("error");
        System.out.print(result11);
    }
}


