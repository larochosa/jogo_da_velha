package fundamentos;

import java.util.Scanner;

public class Ex02AreaQuadrado {
    static void main() {
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira o tamanho lado do quadrado: ");
        double lado = leia.nextDouble();
        double quadrado = lado * lado;
        System.out.println(quadrado);

        System.out.println("A área do seu quadrado é: "+ quadrado);
    }
}