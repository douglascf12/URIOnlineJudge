package INICIANTE;

import java.util.Scanner;

public class Main_1018 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int nota100 = 0, nota50 = 0, nota20 = 0, nota10 = 0, nota5 = 0, nota2 = 0, nota1 = 0;
        
        int valor = input.nextInt();
        System.out.printf("%d%n", valor);
        
        if(valor >= 100) {
            nota100 = valor / 100;
            valor = valor - (100 * nota100);
        }
        if(valor >= 50) {
            nota50 = valor / 50;
            valor = valor - (50 * nota50);
        }
        if(valor >= 50) {
            nota50 = valor / 50;
            valor = valor - (50 * nota50);
        }
        if(valor >= 20) {
            nota20 = valor / 20;
            valor = valor - (20 * nota20);
        }
        if(valor >= 10) {
            nota10 = valor / 10;
            valor = valor - (10 * nota10);
        }
        if(valor >= 5) {
            nota5 = valor / 5;
            valor = valor - (5 * nota5);
        }
        if(valor >= 2) {
            nota2 = valor / 2;
            valor = valor - (2 * nota2);
        }
        if(valor >= 1) {
            nota1 = valor / 1;
            valor = valor - (1 * nota1);
        }
                
        System.out.printf("%d nota(s) de R$ 100,00%n", nota100);
        System.out.printf("%d nota(s) de R$ 50,00%n", nota50);
        System.out.printf("%d nota(s) de R$ 20,00%n", nota20);
        System.out.printf("%d nota(s) de R$ 10,00%n", nota10);
        System.out.printf("%d nota(s) de R$ 5,00%n", nota5);
        System.out.printf("%d nota(s) de R$ 2,00%n", nota2);
        System.out.printf("%d nota(s) de R$ 1,00%n", nota1);
    }
}
