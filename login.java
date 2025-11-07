import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        String usuariCorrecte = "admin";
        String passwordCorrecte = "1234";
        String usuari, password;

        do {
            System.out.print("Introdueix l'usuari: ");
            usuari = llegir.nextLine();

            System.out.print("Introdueix la contrasenya: ");
            password = llegir.nextLine();

        

        } while (!(usuari.equals(usuariCorrecte) && password.equals(passwordCorrecte)));

        System.out.println("Login correcte! Benvingut/da, " + usuari + ".");
        llegir.close();
    }
}
   
