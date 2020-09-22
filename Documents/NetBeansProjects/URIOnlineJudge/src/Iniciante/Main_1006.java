package Iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main_1006 {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        double MEDIA = ((A * 2.0) + (B * 3.0) + (C * 5.0)) / 10.0;
        
        System.out.printf("MEDIA = %.1f%n", MEDIA);
        input.close();
    }
 
}
