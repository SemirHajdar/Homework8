import java.util.Scanner;
public class Qamp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Your bill is: ");
        int bill = keyboard.nextInt();
        System.out.println("Your money is: ");
        int money = keyboard.nextInt();

        int change = money - bill;

            if ((money <=100) && (bill > 0)) {

            int twenty;
            int ten;
            int two;
            int one;

            System.out.println("Your change is: " + change + '\n');

            twenty = change / 20;
            change = change % 20;
            ten = change / 10;
            change = change % 10;
            two = change / 2;
            change = change % 2;
            one = change / 1;
            change = change % 1;

            System.out.println("You will get " + twenty + " 20KM banknotes.");
            System.out.println("You will get " + ten + " 10KM banknotes.");
            System.out.println("You will get " + two + " 2KM coins.");
            System.out.println("You will get " + one + " 1KM coins.");

        }
        else if (money>100) {
            System.out.print("You have too much money");
    }
        else if (bill==0) {
            System.out.print("You didn't buy anything did you");

        }
        else if (bill<0) {
            System.out.print("Did you maybe break something");

        }
}
}
