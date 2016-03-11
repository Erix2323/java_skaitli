import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Er!k on 2/27/2016.
 */
public class MainClass_1 {



    public static void main(String[] args) {
        System.out.println("Ievadiet skaitļus.Noslēdzot pieprasījumu ar 0");
        Scanner scanner = new Scanner(System.in);
        int n;
        int pcount=0;
        int ncount=0;
        ArrayList <Integer> AL = new ArrayList();

        do {
            System.out.print("Ievadiet skaitli:");
            n = scanner.nextInt();
            AL.add(n);
            if (n != 0) {

              System.out.print(AL);

            }
        } while (n != 0);
       for (int i = 0; i < AL.size() - 1; i++) {

           int number =(AL.get(i));
           if(number % 2 == 0){
               pcount++;
           } else ncount++;
         //  System.out.println(AL.get(i));

        }
       // Object obj = Collections.max(AL);

      //  System.out.println("MAx number is....."+obj);
        System.out.println("Pāra skaitļu skaits....."+pcount);
        System.out.println("Nepāru skaitļu skaits....."+ncount);
    }
}
