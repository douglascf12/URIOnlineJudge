package INICIANTE;

import java.util.Locale;
import java.util.Scanner;

public class Main_1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        int codPeca1 = input.nextInt();
        int qtdPeca1 = input.nextInt();
        double valorUnit1 = input.nextDouble();
        int codPeca2 = input.nextInt();
        int qtdPeca2 = input.nextInt();
        double valorUnit2 = input.nextDouble();
        
        double TOTAL = (qtdPeca1 * valorUnit1) + (qtdPeca2 * valorUnit2);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", TOTAL);
    }
}
