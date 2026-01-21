package Übung3;

public class H1_main {
    public static void main(String[] args) {

        double guthaben = 2000.00;
        double monEingang = 800.00;
        int rating = 6;
        boolean warnhinweis, negativ;

        if (guthaben < 0){
            negativ = true;
        }else {
            negativ = false;
        }

        if (guthaben > 0){
            rating = rating + 3;
        }

        if (guthaben == 0){
            rating = rating + 2;
        }

        if (guthaben < 0 && monEingang >= Math.abs(guthaben)){
            rating = rating + 1;
        }else if (guthaben < 0 && monEingang < Math.abs(guthaben)){
            rating = rating - 1;
        }

        if (guthaben < 0 && monEingang < Math.abs(guthaben) && rating < 0){
            warnhinweis = true;
        } else {
            warnhinweis = false;
        }

        System.out.println("negativ = " + negativ);
        System.out.println("rating = " + rating);
        System.out.println("warnhinweis = " + warnhinweis);

    }
}
