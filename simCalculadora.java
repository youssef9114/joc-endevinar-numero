import java.util.Scanner;

public class simCalculadora {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);
     
        int opcio;

        do {
            
        System.out.print("Introdueix el primer número: ");
        double num1 = llegir.nextDouble();
        System.out.print("Introdueix el segon número: ");
        double num2 = llegir.nextDouble();

        System.out.print("opcions: 1.suma /n 2.resta /n 3.multiplican /n 4.dividir /n 5.sortir");
        opcio = llegir.nextInt();   
    
        switch (opcio){
            case 1: 
                System.out.println(num1 + num2);
                break;
            case 2: 
                System.out.println(num1 - num2);
                break;
            case 3: 
                System.out.println(num1 * num2);
                break;
            case 4: 
                System.out.println(num1 / num2);
                break;
            case 5: 
                System.out.print("Adeu");
                break;
            default: 
                System.out.print("Error no existeix");
                break;
            }

        } while (opcio != 5);

        llegir.close();
    }
}