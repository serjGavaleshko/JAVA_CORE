package Homework_1;

import java.util.Scanner;

public class ConsoleCalc {


    public void insertion() {

        Scanner in = new Scanner(System.in);
        System.out.print("Input first integer: ");
        float int1 = in.nextInt();
        System.out.print("Input second integer: ");
        float int2 = in.nextInt();
        System.out.print("Input +,-,/,*: ");
        char char1 = in.next().charAt(0);
        in.close();
        float result11 = 7;

switch (char1) {
    case '+' : result11 = int1 + int2;
        break;
    case '-' : result11 = int1 - int2;
        break;
    case '*' : result11 = int1 * int2;
        break;
    case '/' : result11 = int1 / int2;
        break;
    default : System.out.println("error");
}
        System.out.println("Result: "+result11);


    }
}


