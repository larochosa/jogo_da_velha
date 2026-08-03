package estruturas_controle;

import java.util.Scanner;

public class Ex02IMC {
    static void main() {
        Scanner leia= new Scanner(System.in);
        System.out.println("Digite seu peso : ");
        double peso = leia.nextDouble();
        System.out.println("Digite sua altura : ");
        double altura = leia.nextDouble();

        double imc = peso / (altura * altura );

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc >= 18.6 && imc < 24.9) {
            System.out.println("Classificação: Peso normal");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc >= 30 && imc < 34.9) {
            System.out.println("Classificação: Obesidade Grau I");
        } else if (imc >= 35 && imc < 39.9) {
            System.out.println("Classificação: Obesidade Grau II");
        } else {
            System.out.println("Classificação: Obesidade Grau III (Mórbida)");
        }
    }
}


