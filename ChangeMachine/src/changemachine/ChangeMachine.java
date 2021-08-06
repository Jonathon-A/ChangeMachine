package changemachine;

import java.util.Scanner;

public class ChangeMachine {

    public static void main(String[] args) {
        int j = 1;
        while (j > 0) {
            j--;
            Scanner input = new Scanner(System.in);
            System.out.println("How much money do you need to convert to change?");
            double money = input.nextDouble();
            System.out.println("Calculating change");
            System.out.println("");
            int fifty = (int) (money / 50);
            System.out.println(fifty + " 50 pound notes.");
            double fiftyR = (money % 50);
            int twety = (int) (fiftyR / 20);
            System.out.println(twety + " 20 pound notes.");
            double twentyR = (fiftyR % 20);
            int ten = (int) (twentyR / 10);
            System.out.println(ten + " 10 pound notes.");
            double tenR = (twentyR % 10);
            int five = (int) (tenR / 5);
            System.out.println(five + " 5 pound notes.");
            double fiveR = (tenR % 5);
            int two = (int) (fiveR / 2);
            System.out.println(two + " 2 pound coins.");
            double twoR = (fiveR % 2);
            int one = (int) (twoR / 1);
            System.out.println(one + " 1 pound coins.");
            double oneR = (twoR % 1);
            int point5 = (int) (oneR / 0.5);
            System.out.println(point5 + " 50p coins.");
            double point5R = (oneR % 0.5);
            int point2 = (int) (point5R / 0.2);
            System.out.println(point2 + " 20p coins.");
            double point2R = (point5R % 0.2);
            int point1 = (int) (point2R / 0.1);
            System.out.println(point1 + " 10p coins.");
            double point1R = (point2R % 0.1);
            int point05 = (int) (point1R / 0.05);
            System.out.println(point05 + " 5p coins.");
            double point05R = (point1R % 0.05);
            int point02 = (int) (point05R / 0.02);
            System.out.println(point02 + " 2p coins.");
            double point02R = (point05R % 0.02);
            int point01 = (int) (point02R / 0.01);
            System.out.println(point01 + " 1p coins.");
            //floating point issues can cause issues ¯\_(ツ)_/¯
            System.out.println("");
            System.out.println("Would you like to convert again (y/n)? ");
            String again = input.next();
            if (again.equalsIgnoreCase("y")) {
                System.out.println("Restarting");
                System.out.println("");
                j = 1;
            }
        }
    }
}
