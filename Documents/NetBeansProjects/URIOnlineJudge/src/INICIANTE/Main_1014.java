package INICIANTE;

import java.util.Locale;
import java.util.Scanner;

public class Main_1014 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        int x = input.nextInt();
        double y = input.nextDouble();
        
        double consumo = x / y;
        
        System.out.printf("%.3f km/l%n", consumo);
    }
}
