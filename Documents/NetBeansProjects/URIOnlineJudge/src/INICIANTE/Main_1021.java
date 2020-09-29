package INICIANTE;

import java.util.Locale;
import java.util.Scanner;

public class Main_1021 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        double n = input.nextDouble();
        int valor;
        
        System.out.println("NOTAS:");
        valor = (int) n / 100;
        System.out.printf("%d nota(s) de R$ 100.00%n", valor);
        n = n % 100;
        
        valor = (int) n / 50;
        System.out.printf("%d nota(s) de R$ 50.00%n", valor);
        n = n % 50;
        
        valor = (int) n / 20;
        System.out.printf("%d nota(s) de R$ 20.00%n", valor);
        n = n % 20;
        
        valor = (int) n / 10;
        System.out.printf("%d nota(s) de R$ 10.00%n", valor);
        n = n % 10;
        
        valor = (int) n / 5;
        System.out.printf("%d nota(s) de R$ 5.00%n", valor);
        n = n % 5;
        
        valor = (int) n / 2;
        System.out.printf("%d nota(s) de R$ 2.00%n", valor);
        n = n % 2;
        
        System.out.println("MOEDAS:");
        valor = (int) n / 1;
        System.out.printf("%d moeda(s) de R$ 1.00%n", valor);
        n = n % 1;
        
        n = n * 100;
        
        valor = (int) n / 50;
        System.out.printf("%d moeda(s) de R$ 0.50%n", valor);
        n = n % 50;
        
        valor = (int) n / 25;
        System.out.printf("%d moeda(s) de R$ 0.25%n", valor);
        n = n % 25;
        
        valor = (int) n / 10;
        System.out.printf("%d moeda(s) de R$ 0.10%n", valor);
        n = n % 10;
        
        valor = (int) n / 5;
        System.out.printf("%d moeda(s) de R$ 0.05%n", valor);
        n = n % 5;
        
        valor = (int) n / 1;
        System.out.printf("%d moeda(s) de R$ 0.01%n", valor);
    }
}
