import java.util.Scanner;

public class forfortiangle {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        System.out.print("Introdueix un número: ");
        int files = llegir.nextInt();

        for (int i = 1; i <= files; i++) {
                System.out.println("*");
            
        }

        llegir.close();
    }
}
