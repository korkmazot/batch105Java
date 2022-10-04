package ders02_dataTurleri_scanner;

import com.intellij.designer.designSurface.ScalableComponent;

import java.util.Scanner;

public class C08_Scanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen birinci tam sayiyi giriniz sayi1: ");
        int sayi1 = scan.nextInt();

        System.out.println("Lutfen ikinci tam sayiyi giriniz sayi2: ");
        int sayi2 = scan.nextInt();

        int n = sayi1;
        sayi1 = sayi2;
        sayi2 = n;

        System.out.println("Sayi 1 = " + sayi1);
        System.out.println("Sayi 2 = " + sayi2);

    }
}
