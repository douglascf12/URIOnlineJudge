package CONTEST_DE_NATAL_2020;

import java.util.Scanner;

public class Main_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0, hBonecos = 0, hArquitetos = 0, hMusicos = 0, hDesenhistas = 0, p = 0;
        while(n < 1 && n <= 1000) {
            n = input.nextInt();
        }
        for(int i = 0; i < n; i++) {
            String e = input.next();
            String g = input.next();
            int h;
            if(g.equals("bonecos")) {
                h = input.nextInt();
                hBonecos = hBonecos + h;
            } else if(g.equals("arquitetos")) {
                h = input.nextInt();
                hArquitetos = hArquitetos + h;
            } else if(g.equals("musicos")) {
                h = input.nextInt();
                hMusicos = hMusicos + h;
            } else if(g.equals("desenhistas")) {
                h = input.nextInt();
                hDesenhistas = hDesenhistas + h;
            }
        }
        p = hBonecos / 8;
        p = p + hArquitetos / 4;
        p = p + hMusicos / 6;
        p = p + hDesenhistas / 12;
        System.out.println(p);
    }
}
