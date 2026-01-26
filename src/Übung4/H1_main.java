package Übung4;

public class H1_main {

    public static void main (String[] args){

        int zone = 43;
        double price = 0.0;

        switch (zone){
            case 1:
                price = 2.0;
                System.out.println("Ihr Ticket kostet :"+price);
                break;
            case 2:
                price = 2.35;
                System.out.println("Ihr Ticket kostet :"+price);
                break;
            case 3:
            case 4:
                price = 2.85;
                System.out.println("Ihr Ticket kostet :"+price);
                break;
            case 5:
                price = 3.55;
                System.out.println("Ihr Ticket kostet :"+price);
                break;
            default:
                price = 4.00;
                System.out.println("Ihr Ticket kostet :"+price);
                break;
        }

    }
}
