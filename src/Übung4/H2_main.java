package Übung4;

public class H2_main {
    public static void main ( String[] args){

        boolean x,y,a,b,c;
        int input = 0;

        if (input == 10 || input == 11){
            x = true;
        }else x = false;

        if (input == 11 || input == 1){
            y = true;
        }else y = false;

        if (x == true && y == true){
            a = true;
        } else a = false;

        if (x == true || x != y){
            b = true;
        }else b = false;

        if (y == true){
            c = false;
        }else c = true;

        System.out.println("x=" + x + ", y=" + y + ", a=" + a + ", b=" + b + ", c=" + c);

    }
}


//package h2;
//
//public class H2_main {
//    public static void main(String[] args) {
//
//        int input = 10;
//        boolean x, y, a, b, c;
//
//        x = (input == 10 || input == 11);
//        y = (input == 11 || input == 1);
//
//        // E1: x, E2: y, E3: x != y
//        a = x && y;
//        b = x || (x != y);
//        c = !y; // entspricht genau der gegebenen Wahrheitstabelle
//
//        System.out.println("x=" + x + ", y=" + y + ", a=" + a + ", b=" + b + ", c=" + c);
//    }
//}