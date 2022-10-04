package ders03_dataCastingWrapperClass;

public class C05_DataCastingWrapperClass {

    public static void main(String[] args) {

        int sayi = 10;
        String str = "Java cok guzel";

        //Primitive data turleri sadece deger barindirirlar, hazir metodlari yoktur.
        //Wrapper classlar primitice data turlerindeki degerleri alirlar ancak metodlarida vardir

        char krk = 'a';
        Character krkWrapper = 'c';

        System.out.println(Character.isLetter('5'));  //false
        System.out.println(Character.isDigit('7'));    //true

        String str1 = "123";
        String str2 = "12";

        //str1 ve str2 degerlrini matematiksel olarak toplayin

        System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2));

        //Integer.parseInt icine yazilan str rakamlardan olusuyorsa str'i int'a cevirir
        //Ancak bir karakter bile rakam degilse hata verir.

        System.out.println(Integer.MAX_VALUE);

    }
}
