package INICIANTE;

import java.util.Scanner;

public class Main_1017 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int tempo = input.nextInt();
        int velocidade = input.nextInt();
        
        double combustivel = (double)(tempo * velocidade) / 12;
                
        System.out.printf("%.3f%n", combustivel);
    }
}
