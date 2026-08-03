package fundamentos;

import java.util.Scanner;

public class Ex03AreaRetangulo {
    static void main() {
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira o tamanho da base do retangulo: ");
        double base = leia.nextDouble();
        System.out.println("Insira o tamanho da altura do retangulo: ");
        double altura = leia.nextDouble();
        double retangulo = base * altura;


        System.out.println("A área do seu retangulo é: "+ retangulo);

    }
}