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
        //zin weergeven
        System.out.println(zin);

        //variabele aanmaken voor output tafel
        String output;

        // getallen van een tot tien in lus aanmaken
        for (int x=1; x<=10; x++) {
            //string weergeven voor tafel
            output = x + " x " + getal + " = ";
            //variabele z waarin de cijfers uit de lus worden vermenigvuldigd met het ingevoerde getal
            int z = x * getal;
            // de eerdere string met output van de tafel plakken aan de variable met de uitkomst
            output = output + z;
            //output weergeven
            System.out.println(output);
        }


    }

}
