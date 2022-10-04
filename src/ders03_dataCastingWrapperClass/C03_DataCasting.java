package ders03_dataCastingWrapperClass;

import java.util.Scanner;

public class C03_DataCasting {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir tamsayi giriniz = ");

        int sayi = scan.nextInt();

        byte donusenSayi = (byte)sayi;

        System.out.println("Girdiginiz sayi : " + sayi + " donusen sayi : " + donusenSayi);
    }
}
