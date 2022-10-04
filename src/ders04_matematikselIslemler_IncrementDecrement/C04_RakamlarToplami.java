package ders04_matematikselIslemler_IncrementDecrement;

public class C04_RakamlarToplami {

    public static void main(String[] args) {

        int input = 1458;

        int birlerBasamagi;
        int rakamlarToplami = 0;

        birlerBasamagi = input % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        input = input / 10;

        birlerBasamagi = input % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        input = input / 10;

        birlerBasamagi = input % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        input = input / 10;

        birlerBasamagi = input % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        input = input / 10;

        System.out.println("Verilen sayinin rakamlar toplami = " + rakamlarToplami);



    }
}
