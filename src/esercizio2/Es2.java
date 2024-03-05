package esercizio2;
import java.util.Scanner;
public class Es2 {
    public static void main(String[] args) {
;      Scanner sc = new Scanner(System.in);
      System.out.println("Inserisci un numero da 0 a 3");
      int n = sc.nextInt();
        System.out.println(toLetters(n));
}

public static String toLetters(int n) {
        switch (n) {
            case 0 :{ return "zero";

            }
            case 1 :{ return "one";
            }
            case 2 :{ return "two";

            }
            case 3 :{ return "three";

            }
            default:return "Il numero inserito non è valido";
        }}





}
