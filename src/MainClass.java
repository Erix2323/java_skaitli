import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Er!k on 2/27/2016.
 */
public class MainClass {



    public static void main(String[] args) {
        System.out.println("Ievadiet skaitļus.Noslēdzot pieprasījumu ar 0");
        Scanner scanner = new Scanner(System.in);
        int n;
        ArrayList AL = new ArrayList();

        do {
            System.out.print("Ievadiet skaitli:");
            n = scanner.nextInt();
            AL.add(n);
            if (n != 0) {

                System.out.print(AL);

                // System.out.println("Jūsu skaitlis-" + n);
            }
        } while (n != 0);
    //    for (int i = 0; i < AL.size() - 1; i++) {


       // }
        Object obj = Collections.max(AL);
        System.out.println("MAx number is....."+obj);

    }
}
