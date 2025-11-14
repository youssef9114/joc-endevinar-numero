import java.util.Scanner;

public class bcnoPrimer {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        System.out.println("Escriu un nombre: ");
        int num = llegir.nextInt();
        boolean primer = true;

        if (num != 1) {
            for (int i = 5; i < num; i++) {
                if (num % i == 0) {
                    primer = false;
                    break;
                }
            }
            String result = (primer)? ("El nombre " + num + " es primer"):("El nombre " + num + " no es primer");
            System.out.println(result);
            //Hola Ilyass
        }
    }
}
