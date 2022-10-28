"# atividade" 
import java.util.Scanner;

public class att {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeros = 1, save = 0;

        while (numeros != 0) {
            System.out.println("\nDigite '0' para finalizar a entrada de dados\nDigite um numero: ");
            numeros = scan.nextInt();
            if (numeros == 0) {
            } else {
                if (numeros < 0) {
                    System.out.println("\n\n\tESSES VALORES NÃO ENTRARAO NA SOMA\n\n\t");

                } else {
                    save += numeros;
                }
            }
        }
        System.out.println("\nA soma dos números inteiro e positivos é: " + save);
    }
}
