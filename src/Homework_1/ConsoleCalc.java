package Homework_1;

import java.util.Scanner;

public class ConsoleCalc {

    public void input() {
    input1();
    input2();
    input3();
    }


    private char  input1() {

        Scanner in = new Scanner(System.in);

        System.out.print("Input +,-,/,*: ");
        char char1 = in.next().charAt(0);
        in.close();

        return char1;
    }
    private float input3() {

        Scanner in = new Scanner(System.in);
        System.out.print("Input first integer: ");
        float float1 = in.nextFloat();

        return float1;
    }


    private float  input2() {

        Scanner in = new Scanner(System.in);

        System.out.print("Input second integer: ");
        float float2 = in.nextFloat();

        in.close();

        return float2;
    }
 public void operation() {
        float result11 = 0;
switch (input1()) {
    case '+' : result11 = input1() + input2();
        break;
    case '-' : result11 = input1() - input2();
        break;
    case '*' : result11 = input1() * input2();
        break;
    case '/' : result11 = input1() / input2();
        break;
    default : System.out.println("error");
}
        System.out.println("Result: "+result11);


    }
}


