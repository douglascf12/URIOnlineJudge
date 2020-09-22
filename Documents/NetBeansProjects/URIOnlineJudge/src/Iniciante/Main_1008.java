package Iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 
public class Main_1008 {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        int NUMBER = input.nextInt();
        int HOURS = input.nextInt();
        double PRICEHOUR = input.nextDouble();
        
        double SALARY = HOURS * PRICEHOUR;
        
        System.out.printf("NUMBER = %d%n", NUMBER);
        System.out.printf("SALARY = U$ %.2f%n", SALARY);
    }
 
}
