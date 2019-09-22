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

    }

    public static int calc(int int1, int int2, char char1){

        if (char1 == '+'){
                int result11  = int1 + int2;
        }else if(char1 == '-'){
                 int result11  = int1 - int2;
        }else if(char1 == '*'){
            int result11  = int1 * int2;
        }else if(char1 == '/'){
            int result11  = int1 / int2;
        }else
        System.out.println("error");

    }


}

