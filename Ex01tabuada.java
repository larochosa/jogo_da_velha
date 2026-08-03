package estruturas_controle;

import java.util.Scanner;

public class Ex01tabuada{
    static void main(){
        Scanner leia= new Scanner(System.in);
        System.out.println("Digite um número de 1 a 10");
        int numero = leia.nextInt();

        System.out.println("Tabuada do número" + numero + ": ");
        for (int i = 1; i <= 10; i++)
            System.out.println(numero + " x " + i + " = " + (numero * i));
    }
}
