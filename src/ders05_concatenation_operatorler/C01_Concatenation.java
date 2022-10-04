package ders05_concatenation_operatorler;

public class C01_Concatenation {

    public static void main(String[] args) {

        //sadece asagidaki verilen variable lari kullanarak istenen degerleri yazdiralim

        String s1 = "Java";
        String s2 = "Guzeldir";
        String s3 = "";
        String s4 = " ";

        int sayi1 = 4;
        int sayi2 = 3;

        //Java Guzeldir7
        System.out.println(s1 + s4 + s2 + (sayi1 + sayi2));

        //Java Guzelir 12
        System.out.println(s1 + s4 + s2 + s4 +(sayi1 * sayi2));

    }
}
