package ders13_NestedForLoop_MethodOlusturma;

public class C02_StringTersineCevir {

    public static void main(String[] args) {

        String input = "Java her gecen gun guzellesiyor";
        String tersInput = "";

        for(int i=input.length()-1; i>=0; i--){

            tersInput += input.substring(i, i+1);
        }
        System.out.println("Ters hali = " +  tersInput);
    }
}
