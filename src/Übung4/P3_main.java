package Übung4;

public class P3_main {
    public static void main ( String[] args ){

        boolean x, y;

        System.out.println("Für '!(x!=y && x==y)':");

        x = true; y = true;
        System.out.println(!(x!=y && x==y));

        x = true;  y = false;
        System.out.println(!(x!=y && x==y));

        x = false; y = true;
        System.out.println(!(x!=y && x==y));

        x = false; y = false;
        System.out.println(!(x!=y && x==y));
        //Für x || true
        System.out.println("Für 'x || true':");

        x = true; y = true;
        System.out.println(x || true);

        x = true;  y = false;
        System.out.println(x || true);

        x = false; y = true;
        System.out.println(x || true);

        x = false; y = false;
        System.out.println(x || true);
        //Für x && false
        System.out.println("Für 'x && false ':");

        x = true; y = true;
        System.out.println(x && false );

        x = true;  y = false;
        System.out.println(x && false );

        x = false; y = true;
        System.out.println(x && false );

        x = false; y = false;
        System.out.println(x && false );
        //Für (x&&!y)||(!x)
        System.out.println("Für '(x&&!y)||(!x)':");

        x = true; y = true;
        System.out.println((x&&!y)||(!x));

        x = true;  y = false;
        System.out.println((x&&!y)||(!x));

        x = false; y = true;
        System.out.println((x&&!y)||(!x));

        x = false; y = false;
        System.out.println((x&&!y)||(!x));
    }
}
