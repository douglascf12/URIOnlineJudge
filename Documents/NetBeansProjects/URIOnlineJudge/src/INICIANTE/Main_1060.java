package INICIANTE;

import java.util.Locale;
import java.util.Scanner;

public class Main_1060 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        int cont = 0, pos = 0;
        
        do {
            double n = input.nextDouble();
            if(n > 0) {
                pos++;
            }
            cont++;
        } while(cont < 6);
        
        System.out.printf("%d valores positivos%n", pos);
    }
}
