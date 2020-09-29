package AD_HOC;

import java.util.Scanner;

public class Main_1414 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T;
        int N;
        int pontos;
        int soma;
        int empates;
        String time;
        String result = "";
        
        do {
            soma = 0;
            do {
                T = input.nextInt();
            } while(T <= 2 && T >= 200);

            do {
                N = input.nextInt();
            } while(N <= 0 && T >= 10000);

            for(int i = 0; i < T; i++) {
                time = input.next();
                pontos = input.nextInt();
                soma = soma + pontos;
            }
            empates = (N * 3) - soma;
            if(T != 0) {
                result += empates + "\n";
            }
        } while(T != 0);
        System.out.print(result);
    }
}
