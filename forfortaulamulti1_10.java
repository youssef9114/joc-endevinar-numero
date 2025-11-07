import java.util.Scanner;

public class forfortaulamulti1_10 {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

   
        for (int i = 1; i <= 10; i++) {
            System.out.println("Taula de multiplicació del " + i + ":");

            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }

            System.out.println(); 
        }
    }
}
 