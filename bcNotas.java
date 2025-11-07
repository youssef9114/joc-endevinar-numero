import java.util.Scanner;

public class bcNotas {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        int suspesos = 0, aprovats = 0, notables = 0, excellents = 0;
        double nota;

        System.out.println("Introdueix les notes:");

        System.out.print("Nota: ");
        nota = llegir.nextDouble();

        while (nota >= 0) { 
            if (nota < 5)
                suspesos++;
            else if (nota < 7)
                aprovats++;
            else if (nota < 9)
                notables++;
            else if (nota <= 10)
                excellents++;
            else
                System.out.println("Nota no vàlida (ha de ser <= 10)");

            System.out.print("Nota: ");
            nota = llegir.nextDouble();
        }

        System.out.println("\nResultats:");
        System.out.println("Suspesos: " + suspesos);
        System.out.println("Aprovats: " + aprovats);
        System.out.println("Notables: " + notables);
        System.out.println("Excel·lents: " + excellents);

        llegir.close();
    }
}
