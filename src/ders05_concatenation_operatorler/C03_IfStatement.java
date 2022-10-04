package ders05_concatenation_operatorler;

import java.util.Scanner;

public class C03_IfStatement {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki tam sayi giriniz :");

        int s1 = scan.nextInt();
        int s2 = scan.nextInt();

        if(s1>100){
            System.out.println("Ilk sayi 100'den buyuk");
        }
        if(s2%2==0){
            System.out.println("Ikinci sayi cift yazdirin");
        }
        if(s1>s2){
            System.out.println("Ilk sayi daha buyuk");
        }

    }
}
