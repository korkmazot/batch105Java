package ders03_dataCastingWrapperClass;

import org.cyberneko.html.HTMLScanner;

import java.util.Scanner;

public class C04_CharDataCasting {

    public static void main(String[] args) {

        System.out.println('a' + 'b');

        //Ref. to ascii table a=97 and b=98 therefore result is 195

        //Char bir karakter al ve sonra gelen 3 karakteri yazdir

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz : ");

        char girilenKrk = scan.next().charAt(0);

        System.out.println("" + (char)(girilenKrk+1) + (char)(girilenKrk+2) + (char)(girilenKrk+3));

        //Basa "" ekleyip ciktiyi String bir ifadeye ceviriyoruz. Aksi taktirde sayi olarak verir

    }
}
