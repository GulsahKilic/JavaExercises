import java.util.Scanner;
public class GreenGrocer {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        double armut, elma, domates, muz, patlican;

        armut = 2.14;
        elma = 3.67;
        domates = 1.11;
        muz = 0.95;
        patlican = 5;

        System.out.print("Armut kaç kilo?: ");
        double a = inp.nextDouble();

        System.out.print("Elma kaç kilo?: ");
        double b = inp.nextDouble();

        System.out.print("Domates kaç kilo?: ");
        double c = inp.nextDouble();

        System.out.print("Muz kaç kilo?: ");
        double d = inp.nextDouble();

        System.out.print("Patlican kaç kilo?: ");
        double e = inp.nextDouble();

        double sonuc = ((armut*a) + (elma*b) + (domates*c) + (muz*d) + (patlican*e));
        System.out.print("Toplam Tutar:" + sonuc);

    }
}
