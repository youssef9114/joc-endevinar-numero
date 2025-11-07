import java.util.Scanner;

public class sumaMitja {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        int i = 1;          
        int suma = 0;      
        int producte = 1;  
        double mitjana;     

        while (i <= 10) {
            suma = suma + i;        
            producte = producte * i; 
            i++;                  
        }

        mitjana = (double) suma / 10;

        System.out.println("Suma dels 10 primers nombres: " + suma);
        System.out.println("Producte dels 10 primers nombres: " + producte);
        System.out.println("Mitjana dels 10 primers nombres: " + mitjana);

    }
}
