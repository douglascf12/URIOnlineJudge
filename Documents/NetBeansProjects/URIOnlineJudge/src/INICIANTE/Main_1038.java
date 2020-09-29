package INICIANTE;

import java.util.Locale;
import java.util.Scanner;

public class Main_1038 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        int cod = input.nextInt();
        int qtd = input.nextInt();
        
        if(cod == 1) {
            System.out.printf("Total: R$ %.2f%n", (4.00 * qtd));
        } else if(cod == 2) {
            System.out.printf("Total: R$ %.2f%n", (4.50 * qtd));
        } else if(cod == 3) {
            System.out.printf("Total: R$ %.2f%n", (5.00 * qtd));
        } else if(cod == 4) {
            System.out.printf("Total: R$ %.2f%n", (2.00 * qtd));
        } else if(cod == 5) {
            System.out.printf("Total: R$ %.2f%n", (1.50 * qtd));
        }
    }
}
