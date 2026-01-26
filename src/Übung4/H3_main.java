package Übung4;

public class H3_main {
    public static void main ( String[] args){

        float celsiusFloat = 32.21f, fahrenheitFloat;
        double celsiusDouble = 32.21, fahrenheitDouble;

        fahrenheitDouble = celsiusDouble * (1.8) + 32;

        fahrenheitFloat = celsiusFloat * (1.8f) + 32;

        System.out.println(fahrenheitDouble);

        System.out.println(fahrenheitFloat);
    }
}
