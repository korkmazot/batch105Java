package ders04_matematikselIslemler_IncrementDecrement;

public class C08_Pre_Post_Increment {

    public static void main(String[] args) {

        int x = 3;

        int y = 2 * ++x;    //2 * 4 = 8

        int z = 5 + y--;     // 5 + 8 = 13    ama y'nin son degeri 7 olur

        System.out.println(x + y + z);   // 4 + 7 + 13
    }
}
