package esercizio3;
import java.util.Scanner;

public class Es3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Inserisci una stringa (digitare :q per terminare l'inserimento): ");
            String inputStr = scanner.nextLine();
            if (inputStr.length() == 2 && inputStr.charAt(0) == ':' && inputStr.charAt(1) == 'q') {
                System.out.println("Inserimento terminato");
                break;
            }
            stampaCaratteriSeparati(inputStr);
        }
    }
    public static void stampaCaratteriSeparati ( String inputStr) {
        String[] caratteri = inputStr.split("");
        String result = new String();
        for ( int i=0; i<caratteri.length; i++) {
            result += (caratteri[i]);
            if (i < caratteri.length - 1) {
                result += (",");
            }
        }
        System.out.println("Caratteri separati dalla virgola: " + result);
    }

}