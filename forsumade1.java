import java.util.Scanner;
public class forsumade1 {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        System.out.println("pnte un numero: ");
        int numero = llegir.nextInt();

        int suma = 0;

        for (int i = 1; i <= numero; i++) {
            suma += i;
        }

        System.out.println("La suma dels números de l'1 fins a " + numero + " és: " + suma);
        llegir.close();
    }
}


