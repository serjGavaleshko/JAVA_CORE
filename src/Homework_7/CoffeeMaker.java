package Homework_7;

import java.util.Scanner;

public class CoffeeMaker {
    int waterLevel = 2;
    int coffeeLevel = 2;
    int rubbishLevel = 0;
    int milkLevel = 1;
    boolean electricity = true;
    
    public void drinkChoose() throws InterruptedException {
        while (electricity == true) {
            Scanner in = new Scanner(System.in);
            System.out.print("What would you like: 1.Espresso, 2.Latte, 3.Cappuccino ");
            int drink = in.nextInt();
            //in.close();
            switch (drink){
                case 1 : espressoMaker();
                break;
                case 2 : latteMaker();
                break;
                default: System.out.println("error");
            }
        }
    }

    public void espressoMaker()
            throws InterruptedException {
        if (waterLevel >= 1 && coffeeLevel >= 1 && rubbishLevel < 10 ) {
            System.out.println("Heating");
            Thread.sleep(400);
            System.out.println("Coffee is preparing");
            Thread.sleep(1000);
            System.out.println("Coffee is ready");
            waterLevel--;
            coffeeLevel--;
            rubbishLevel++;
            System.out.println("Enjoy");
        } else if (waterLevel < 1){
            System.out.println("Check Water Tank");
        } else if (coffeeLevel < 1) {
            System.out.println("Check Coffee Container");
        }


    }
        public void latteMaker() throws InterruptedException {
            if (waterLevel >= 1 && coffeeLevel >= 1 && rubbishLevel < 10 && milkLevel >= 1 )  {
                System.out.println("Please join nozzle");
                Thread.sleep(400);
                System.out.println("Heating");
                Thread.sleep(400);
                System.out.println("Latte is preparing");
                Thread.sleep(1000);
                System.out.println("Latte is ready");
                waterLevel --;
                coffeeLevel --;
                milkLevel --;
                rubbishLevel ++;
                System.out.println("Enjoy");
            } else {System.out.println("Check Water Tank, Coffee, or Rubbish & Milk");}

    }







}
