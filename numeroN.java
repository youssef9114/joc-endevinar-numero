import java.util.Scanner;


public class numeroN {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);


        System.out.println("escribe un numero: ");
        int num = llegir.nextInt();
        int i = 1;

        while (i <= num) { 
            System.out.println(i);
            i++;
        }
    }
}
