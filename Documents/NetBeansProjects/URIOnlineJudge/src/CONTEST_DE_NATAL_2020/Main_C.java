package CONTEST_DE_NATAL_2020;

import java.util.Scanner;

public class Main_C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, idade;
        String nome;
        do {
            n = input.nextInt();
        } while(n < 3 || n > 30);
        String times[] = new String[n/3];
        for(int i = 0; i < n/3; i++) {
            times[i] = "Time " + (i+1) + "\n";
        }
        
        String nomes[] = new String[n];
        int idades[] = new int[n];
        for(int i = 0; i < n; i++) {
            do {
                nome = input.next();
            } while(nome.length() > 20);
            nomes[i] = input.next();
            do {
                idade = input.nextInt();
            } while(idade < 10 || idade > 100);
            idades[i] = idade;
        }
        
        for(int i = 0; i < times.length; i++) {
            System.out.println(times[i]);
        }
        
        while(nomes != null && idades != null) {
            int maior = 0;
            boolean impar = true;
            for(int i = 0; i < idades.length; i++) {
                if(idades[i] > maior) {
                    maior = idades[i];
                }
            }
            for(int j = 0; j < idades.length; j++) {
                if(idades[j] == maior) {
                    if(impar) {
                        times[0] += nomes[j] + " " + idades[j] + "\n";
                        impar = false;
                    } else {
                        times[1] += nomes[j] + " " + idades[j] + "\n";
                        impar = true;
                    }
                }
            }
        }
        
    }
}
