package estruturas_controle;

import java.util.Scanner;

public class Ex04DivisaoControlada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número inicial (divisor): ");
        int numeroInicial = scanner.nextInt();
        if (numeroInicial == 0) {
            System.out.println("O número inicial não pode ser zero.");
        }


        boolean continuar = true;
        while (continuar) {
            System.out.print("Digite outro número: ");
            int novoNumero = scanner.nextInt();
            if (novoNumero < numeroInicial) {
                System.out.println("Número ignorado por ser menor que o inicial (" + numeroInicial + ").");
                if (novoNumero % numeroInicial != 0) {
                    System.out.println("O número " + novoNumero + " dividido por " +
                            numeroInicial + " tem resto " + (novoNumero % numeroInicial) +
                            ". Execução encerrada.");
                    continuar = false;




                }
            }




        }
    }
}









