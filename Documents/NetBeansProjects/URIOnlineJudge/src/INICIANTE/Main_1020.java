package INICIANTE;

import java.util.Scanner;

public class Main_1020 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int ano = 0, mes = 0;
        
        int dia = input.nextInt();
        
        if(dia >= 365) {
            ano = dia / 365;
            dia = dia - (365 * ano);
        }
        if(dia >= 30) {
            mes = dia / 30;
            dia = dia - (30 * mes);
        }
                
        System.out.printf("%d ano(s)%n", ano);
        System.out.printf("%d mes(es)%n", mes);
        System.out.printf("%d dia(s)%n", dia);
    }
}
