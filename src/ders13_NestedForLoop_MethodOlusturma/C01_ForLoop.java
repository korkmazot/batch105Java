package ders13_NestedForLoop_MethodOlusturma;

public class C01_ForLoop {

    public static void main(String[] args) {

        String input = "Java ne kaadar guzel";

        for(int i=input.length()-1; i>=0; i--){

            System.out.println(input.charAt(i));
        }
    }
}
