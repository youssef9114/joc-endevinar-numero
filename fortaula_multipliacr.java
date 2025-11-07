import java.util.Scanner;

public class fortaula_multipliacr {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        System.out.print("Posa un número: ");
        int num = llegir.nextInt();

        System.out.println("Taula de multiplicar del " + num + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));        }

        }

    }
