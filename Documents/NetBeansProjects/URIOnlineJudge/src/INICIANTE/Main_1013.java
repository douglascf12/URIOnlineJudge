package INICIANTE;

import java.util.Locale;
import java.util.Scanner;

public class Main_1013 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        int maior = (a + b + Math.abs(a - b)) / 2;
        maior = (maior + c + Math.abs(maior - c)) / 2;
        
        System.out.printf("%d eh o maior%n", maior);
    }
}
