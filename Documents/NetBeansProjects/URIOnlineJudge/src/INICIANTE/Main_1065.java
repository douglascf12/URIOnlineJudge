package INICIANTE;

import java.util.Scanner;

public class Main_1065 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int cont = 0, pares = 0;
        
        do {
            int n = input.nextInt();
            if(n % 2 == 0) {
                pares++;
            }
            cont++;
        } while(cont < 5);
        
        System.out.printf("%d valores pares%n", pares);
    }
}
