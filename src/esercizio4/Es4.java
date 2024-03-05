package esercizio4;
import java.util.Scanner;
public class Es4 {
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci un numero intero positivo: ");
     int n = in.nextInt();
     contoRovescio(n);

 }
    public static void contoRovescio(int n){

        for (int i=n;i>=0;i--){
            System.out.println(i);

        }

}
}
