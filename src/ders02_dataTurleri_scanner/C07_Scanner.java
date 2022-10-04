package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C07_Scanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Isminizi giriniz : ");
        String isim = scan.nextLine();

        System.out.println("Soyadinizi giriniz : ");
        String soyadi = scan.nextLine();

        System.out.println("Yasinizi giriniz : ");
        int yas = scan.nextInt();

        System.out.println("Isminiz : " + isim);
        System.out.println("Soyadiniz : " + soyadi);
        System.out.println("Yasiniz : " + yas);
        System.out.println("Kaydiniz basariyla tamamlanmistir.");
    }
}
