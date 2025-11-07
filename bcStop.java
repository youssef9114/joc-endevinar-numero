import java.util.Scanner;

public class bcStop {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);
        String paraula;

        do {
            System.out.print("Escriu una paraula: ");
            paraula = llegir.nextLine();

            if (paraula.equalsIgnoreCase("stop")) { // si és "stop" (majúscula o minúscula)
                System.out.println("Adeu!");
                break; // surt del bucle
            }

        } while (true); // bucle infinit fins que troba "stop"

        llegir.close();
    }
}
