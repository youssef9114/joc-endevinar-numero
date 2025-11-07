import java.util.Scanner;

public class forforrectangle {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        System.out.println("posa l'amplada del rectangle: " );
        int amplada = llegir.nextInt();

        System.out.println("posa l'alçada del rectangle: ");
        int alçada = llegir.nextInt();


        for (int i = 1; i <= alçada; i++) {
        for (int j = 1; j <= amplada; j++) {
        System.out.print("#");
        }
        System.out.println(); 
        }

        llegir.close();
    }
}
