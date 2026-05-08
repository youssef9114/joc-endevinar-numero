import java.util.Scanner;

public class SMParells {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        System.out.print("Soc el Youssef JEJE");
        System.out.print("Introdueix el primer límit: ");
        int inici = llegir.nextInt();

        System.out.print("Introdueix el segon límit: ");
        int fi = llegir.nextInt();

        int suma = 0;
        int producte = 1;
        int comptador = 0;

        int i = inici;

        while (i <= fi) {
            if (i % 2 == 0) { 
                suma += i;
                producte *= i;
                comptador++;
            }
            i++;
        }

        if (comptador > 0) {
            double mitjana = (double) suma / comptador;
            System.out.println("Suma dels parells: " + suma);
            System.out.println("Producte dels parells: " + producte);
            System.out.println("Mitjana dels parells: " + mitjana);
        } else {
            System.out.println("No hi ha nombres parells entre aquests límits.");
        }

        llegir.close();

    }
}
