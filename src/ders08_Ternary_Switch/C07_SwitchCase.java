package ders08_Ternary_Switch;

import java.util.Scanner;

public class C07_SwitchCase {

    public static void main(String[] args) {

        //JDK , J : Java, D : Development , K : Kit

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz : ");
        char harf = scan.next().charAt(0);

        switch(harf) {
            case 'j':
            case 'J':
                System.out.println("Java");
                break;
            case 'd':
            case 'D':
                System.out.println("Development");
                break;
            case 'k':
            case 'K':
                System.out.println("Kit");
                break;
            default:
                System.out.println("Gecersiz harf");

        }


    }
}
