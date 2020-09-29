package INICIANTE;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main_1005 {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        double A = input.nextDouble();
        double B = input.nextDouble();
        double MEDIA = ((A * 3.5) + (B * 7.5)) / 11.0;
        
        System.out.printf("MEDIA = %.5f%n", MEDIA);
        input.close();
    }
 
}