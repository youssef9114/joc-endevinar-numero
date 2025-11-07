import java.util.Scanner;

public class sumant0 {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        int num, suma = 0;
        do {
        System.out.println("escribe un numero: ");
        num = llegir.nextInt();
        suma += num;

        }while (num != 0); 
        System.out.println("El total és: " + suma);
           
    }
}
