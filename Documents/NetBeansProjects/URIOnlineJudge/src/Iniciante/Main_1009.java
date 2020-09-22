package Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Main_1009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        String NOME = input.next();
        double SALARIO = input.nextDouble();
        double VENDAS = input.nextDouble();
        
        double TOTAL = SALARIO + (VENDAS * 0.15);
        
        System.out.printf("TOTAL = R$ %.2f%n", TOTAL);
    }
}
