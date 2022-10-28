package ders15_overloading_whileLoop;

import ders14_methodOlusturma.C01_Carpim;

public class C02_Overloading {

    public static void main(String[] args) {

        carpim(4,5);
        carpim(2.3,6);
        carpim(5,6.4);
        carpim(3,6,7);

    }
    //Bir class ta ayni isim ve ayni signature a sahip iki method olmaz
    public static void carpim(int sayi1, int sayi2){

        System.out.println("Iki integer sayinin carpimi : " + sayi1 * sayi2);
    }

    public static void carpim(int sayi3, int sayi4, int sayi5){

        System.out.println("Uc integer sayinin carpimi : " + sayi3 * sayi4 * sayi5);
    }

    public static void carpim(double sayi1, int sayi2) {

        System.out.println("Double ve int iki integer sayinin carpimi : " + sayi1 * sayi2);

    }

    public static void carpim(int sayi1, double sayi2) {

        System.out.println("Int ve double iki integer sayinin carpimi : " + sayi1 * sayi2);

    }
}
