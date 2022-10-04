package ders04_matematikselIslemler_IncrementDecrement;

import java.util.Scanner;

public class C02_DataCasting {

    public static void main(String[] args) {

        //Kullanicidan 2 sayi aliniz ve ilk sayiyi ikinci sayiya bolun
        //ve sonucun tam sayi kismini yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen iki sayi giriniz : ");

        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        int bolmeSonucu = (int)(sayi1/sayi2);

        System.out.println(bolmeSonucu);
    }
}
