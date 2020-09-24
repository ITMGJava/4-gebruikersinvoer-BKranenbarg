import java.util.Scanner;

public class GebruikersInvoer {

    public static void main(String[] args) {
        //variabele s voor gebruikersinvoer getal
        var s = new Scanner(System.in);
        System.out.println("Voer een getal in");
        //koppel de variabele getal aan het ingevoerde getal
        var getal = s.nextInt();

        //string voor weergeven ingevoerde getal (nog zonder uitkomst)
        String zin = "De tafel van " + getal + " is ";
        System.out.println(zin);

        //variabele aanmaken voor output tafel
        String output;

        // getallen van een tot tien in lus aanmaken
        for (int x=1; x<=10; x++) {
            output = x + " x " + getal + " = ";
            int z = x * getal;
            output = output + z;
            System.out.println(output);
        }


    }

}
