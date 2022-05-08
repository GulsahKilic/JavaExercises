import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        double boy, kilo;
        boy = inp.nextDouble();
        System.out.print("Lütfen Boyunuzu Giriniz: ");

        kilo = inp.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz: ");

        double sonuc = ((kilo / boy) / boy);
        System.out.print("Vücut Kitle Endeksiniz: " + sonuc);
    }
}
