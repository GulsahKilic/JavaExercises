import java.util.Scanner;

public class CalculateCircle {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        double r, cevre, alan;
        r = inp.nextDouble();
        System.out.print("r giriniz: ");
        
        double pi = 3.14;
        cevre = pi*r*r;
        alan = 2*pi*r;

        System.out.print(cevre);
        System.out.print(alan);

    }
}
