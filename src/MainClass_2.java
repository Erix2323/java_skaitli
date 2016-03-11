import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Er!k on 2/27/2016.
 */
public class MainClass_2 {



    public static void main(String[] args) {
        System.out.println("!Ievadiet skaitļus.Noslēdzot pieprasījumu ar 0");
        Scanner scanner = new Scanner(System.in);
        int n;
        Random random = new Random();
        int randomInt = random.nextInt(100);
        do {
            System.out.print(" Ievadiet skaitli:");
            n = scanner.nextInt();
          //  AL.add(n);
            if (n < randomInt) {
                System.out.print("["+randomInt+ "]  ");
                System.out.print("Skaitlis ir lielāks par Jūsējo"+" ");
            }
            if (n > randomInt) {
                System.out.print("["+randomInt+ "]  ");
                System.out.print("Skaitlis ir mazāks par Jūsējo"+" ");
            }
        } while (n != randomInt);
        System.out.println("Uzminējāt....."+randomInt);

    }
}
