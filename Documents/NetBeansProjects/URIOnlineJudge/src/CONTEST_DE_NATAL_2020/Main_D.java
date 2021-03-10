package CONTEST_DE_NATAL_2020;

import java.util.Scanner;

public class Main_D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, g = 0, acoes = 0;
        
        do {
            n = input.nextInt();
        } while(n < 1 || n > 10000);
        for(int i = 0; i < n; i++) {
            do {
                g = input.nextInt();
            } while(g < 1 && g > 10000);
            acoes = acoes + g;
        }
        System.out.println(acoes);        
    }
}