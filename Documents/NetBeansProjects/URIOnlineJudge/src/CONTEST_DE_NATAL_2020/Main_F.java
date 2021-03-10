package CONTEST_DE_NATAL_2020;

import java.time.LocalDate;
import java.util.Scanner;

public class Main_F {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        LocalDate dataAtual = LocalDate.of(2020, 12, 21);
        do {
            n = input.nextInt();
        } while(n <= 0 || n > 50);
        
        float anosBiJ = (float) (n * 11.9 / 4);
        float anosBiS = (float) (n * 29.6 / 4);
        int dJupiter = (int) ((365.0 * (n * 11.9)) + anosBiJ);
        int dSaturno = (int) ((365.0 * (n * 29.6)) + anosBiS);
        
        System.out.println("Dias terrestres para Jupiter = " + dJupiter);
        System.out.println("Data terrestre para Jupiter: " + dataAtual.plusDays(dJupiter));
        System.out.println("Dias terrestres para Saturno = " + dSaturno);
        System.out.println("Data terrestre para Saturno: " + dataAtual.plusDays(dSaturno));
    }
}