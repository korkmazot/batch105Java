package ders08_Ternary_Switch;

public class C03_Ternary {

    public static void main(String[] args) {

        int a = 5;

        //Ternary operatoru tek basina kullanilamaz. Ternary bize sonuc uretir.
        //Bu sonucu ya direk yazdirmali veya bir variable'a atamaliyiz.

        String sonuc = a % 2 == 0 ? "cift sayi" : "tek sayi";
        System.out.println(sonuc);

        //Ternary'in sonucunu bir variable'a atayacaksak true ve false durumlarinda
        //uretilecek sonucun ayni data turune uygun olmasi gerekir.
        //Aksi halde CTE olusur.
        //sout kullanirsak data turunun ayni olmasi gerekmez.

        String sonuc2 = a > 10 ? "buyuk sayi" : "" + 2*a;
        System.out.println(sonuc2);
        System.out.println(a > 10 ? "buyuk sayi" : 2*a);
    }
}
