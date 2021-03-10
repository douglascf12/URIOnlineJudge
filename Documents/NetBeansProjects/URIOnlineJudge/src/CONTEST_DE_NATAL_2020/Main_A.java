package CONTEST_DE_NATAL_2020;

import java.util.Scanner;

public class Main_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b = 0, g = 0;
        while(b < 1 && b < 1000) {
            b = input.nextInt();
        }
        while(g < 100 && g < 1000) {
            g = input.nextInt();
        }
        
        int gMetade = g / 2;
        
        if(gMetade <= b) {
            System.out.println("Amelia tem todas bolinhas!");
        } else {
            int bRestantes = gMetade - b;
            System.out.printf("Faltam %d bolinha(s)%n", bRestantes);
        }
    }
}
