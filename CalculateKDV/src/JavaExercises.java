import java.util.Random;
import java.util.Scanner;
public class JavaExercises {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        double a, k, b;
        System.out.print("Urun fiyati giriniz: ");
        a = inp.nextDouble();
        k = a+((a*18)/100);
        b = ((a*18)/100);
        System.out.println("Urunun ana fiyati: " +a);
        System.out.println("KDVli fiyati: "+ k);
        System.out.println("KDV tutari: " +b);

    }







}
