import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Qamp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Your bill is: ");
        double bill = keyboard.nextDouble();
        System.out.println("Your money is: ");
        double money = keyboard.nextDouble();

        double change = money - bill;

            if ((money <=100) && (bill > 0)) {

                double twenty;
                double ten;
                double two;
                double one;
                double fiftyCents;
                double twentyCents;
                double tenCents;
                double oneCents;

            NumberFormat format = new DecimalFormat("0.00");
            System.out.println("Your change is: " + format.format(change) + '\n');

            twenty = change / 20;
            change = change % 20;
            ten = change / 10;
            change = change % 10;
            two = change / 2;
            change = change % 2;
            one = change / 1;
            change = change % 1;
            fiftyCents = change / 0.5;
            change = change % 0.5;
            twentyCents = change / 0.2;
            change = change % 0.2;
            tenCents = change / 0.10;
            change = change % 0.10;
            oneCents = change / 0.01;
            change = change % 0.01;

            System.out.println("You will get " + Math.round((int) twenty) + " 20KM banknotes.");
            System.out.println("You will get " + Math.round((int)ten) + " 10KM banknotes.");
            System.out.println("You will get " + Math.round((int)two) + " 2KM coins.");
            System.out.println("You will get " + Math.round((int)one) + " 1KM coins.");
            System.out.println("You will get " + Math.round((int)fiftyCents) + " 0.50KM coins.");
            System.out.println("You will get " + Math.round((int)twentyCents) + " 0.20KM coins.");
            System.out.println("You will get " + Math.round((int)tenCents) + " 0.10KM coins.");
            System.out.println("You will get " + Math.round((float)oneCents) + " 0.01KM coins.");
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
