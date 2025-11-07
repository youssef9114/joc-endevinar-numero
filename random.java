import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        int num =(int)(Math.random()*11), resposta, oportunitats=0;

        do { 
            System.out.println("escull un num de l`1 al 10: ");
            resposta = llegir.nextInt();
            oportunitats++;

        } while (num !=resposta || oportunitats <3);
        if (num == resposta) {
            System.out.println("hes encertat");
        }else{
            System.out.println("has perdnt");
        }

    }
}
