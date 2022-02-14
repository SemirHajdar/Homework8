import java.util.Scanner;
public class Qamp5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number A ");
        int A = keyboard.nextInt();
        System.out.println("Enter number B ");
        int B = keyboard.nextInt();
        System.out.println("Enter number B ");
        int C = keyboard.nextInt();
        System.out.println("Enter number B ");
        int D = keyboard.nextInt();
        int sum = A+B+C+D;

        if (((A>0) && (B>0)) || ((C>0) && (D>0))) {
            System.out.println("SUM A + B + C + D = " + sum);
        if (sum>100) {
            System.out.println("SUM A + B + C + D is greater than 100 ");
        if (sum%2==0)
            System.out.println("SUM can be divided by 2, and result is " + (sum/2));
        else
            System.out.println("SUM can't be divided by 2");
             int sum2 = sum - 1;
        if (sum2%2==0)
            System.out.println("SUM can be divided by 2 when we -1 the sum, and result is " + (sum2/2));
        else
            System.out.println("The number is still not divisible by 2");
        } else  {
            System.out.println("SUM isn't greater than 100.");
        }
        }
    }
}