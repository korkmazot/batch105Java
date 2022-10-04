package ders04_matematikselIslemler_IncrementDecrement;

public class C07_Pre_Post_Increment {

    public static void main(String[] args) {

        int a = 10;
        int b = a++;   //a=11 , b=10   once islem, sonra arttir
        int c = ++b;   //b=11 . c=11   once arttir, sonra islem

        System.out.println("a : " + a + ", b : " + b + ", c = " + c);

        a = 20;
        b = ++a;    // a=21 , b=21      once arttir, sonra islem
        c = a++;    // a=22 , c=21      once islem, sonra arttir

        System.out.println("a : " + a + ", b : " + b + ", c = " + c);

        a=30;

        System.out.println(a++);  //a=30   once islem sonra arttir
        System.out.println(--a);  //a=30   once azzalt sonra islem
        System.out.println(a--);  //a=30   once islem sonra azalt
        System.out.println(a);    //a=29

    }
}
