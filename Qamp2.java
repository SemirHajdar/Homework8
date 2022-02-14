import java.util.Scanner;

public class Qamp2 {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Unesite broj A: ");
    int A = keyboard.nextInt();


    if ((A>10) && (A%3==0) && (A<=10000)) {
        System.out.println("Unesite broj B: ");
        int B = keyboard.nextInt();
    if (A%B==0)
        System.out.println("A je djeljivo sa B");
    else
        System.out.println("A nije djeljivo sa B");

    } else
        System.out.println("Vrijednost A nije odgovarajuća");

}
}
