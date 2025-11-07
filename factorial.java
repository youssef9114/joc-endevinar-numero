import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);
        System.out.print("Introdueix un número: ");
        int num = llegir.nextInt();

        int factorial = 1;
        int i = 1;

        while (i <= num) {
            factorial *= i;
            i++;
        }

        System.out.println("El factorial de " + num + " és: " + factorial);
        llegir.close();
    }
}
