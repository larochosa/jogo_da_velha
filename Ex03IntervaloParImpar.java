package estruturas_controle;

import java.util.Scanner;

public class Ex03IntervaloParImpar {
    static void main(){
        Scanner leia = new Scanner(System.in);
    int inicio = 1;
int fim = 10;

       System.out.println("Analisando o intervalo de " + inicio + " a " + fim + ":");

       for (int i = inicio; i <= fim; i++) {
        if (i % 2 == 0) {
        System.out.println(i + " é Par");
           } else {
                   System.out.println(i + " é Ímpar");
           }
                   }
                   }
                   }


