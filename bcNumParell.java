import java.util.Scanner;

public class bcNumParell {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int num = llegir.nextInt();

        for (int i = 0; i < num; i+=2) {
             System.out.println(i);
             continue;
        }
    }
}
