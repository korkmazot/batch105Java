package ders05_concatenation_operatorler;

import java.util.Scanner;

public class C04_Deneme {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen ondalikli bir sayi giriniz : ");
        double ondalikliSayi = scan.nextDouble();

        System.out.println("Lutfen bir tamsayi giriniz : ");
        int tamSayi = scan.nextInt()
;
        System.out.println(ondalikliSayi + tamSayi);


    }
}
