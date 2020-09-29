package INICIANTE;

import java.util.Scanner;

public class Main_1019 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int horas = 0, minutos = 0;
        
        int n = input.nextInt();
        
        if(n >= 3600) {
            horas = n / 3600;
            n = n - (3600 * horas);
        }
        if(n >= 60) {
            minutos = n / 60;
            n = n - (60 * minutos);
        }
                
        System.out.printf("%d:%d:%d%n", horas, minutos, n);
    }
}
