package esercizio1;
import java.util.Scanner;
public class Es1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci una stringa:");
        String n = in.nextLine();
        if (pariDispari(n.length())) {
        System.out.println("Il numero dei caratteri della stringa che hai inserito è dispari");

}else{
            System.out.println("Il numero dei caratteri della stringa che hai inserito è pari");
        }
        Scanner in2 = new Scanner(System.in);
        System.out.println("Inserisci un anno:");
        int n2 = in2.nextInt();
        if (annoBisestile(n2)) {
            System.out.println("L'anno inserito è bisestile");        } else {
            System.out.println("L'anno inserito non è bisestile");
        }
    }
public static boolean pariDispari(int n) {
        if (n % 2 == 0) {    return false;
} else

    {
        return true;
}

}

public static boolean annoBisestile(int n) {
        if (n % 4 == 0 || ( n%400==0 && n%100==0))
        {    return true;}
        else{
            return false;
        }
}
}








