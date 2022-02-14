import java.util.Scanner;
public class Qamp3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number A ");
        int A = keyboard.nextInt();
        System.out.println("Enter number B ");
        int B = keyboard.nextInt();

if (A>B) {
    System.out.println("SUM A + B = " + (A+B));

} else if (B>A) {
    System.out.println("B - A = " + (B-A));

} else if (A==B) {
    System.out.println("A * B = " + (A*B));
}
}
}
