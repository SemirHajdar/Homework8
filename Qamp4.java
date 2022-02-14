import java.util.Scanner;
public class Qamp4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number X and check if the result of this formula ((X + X + 6)/2 - X) can be divided by 2: ");
        int X = keyboard.nextInt();
        int newNumber = (X + X + 6)/2 - X;
        if (newNumber%2==0) {
            System.out.println("Your Number can be divided by 2 and its value is  " + newNumber);
        }
        else  {

            System.out.println("Your Number can't be divided by 2 and its value is  " + newNumber);
        }
    }
}

