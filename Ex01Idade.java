package fundamentos;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Ex01Idade {
    static void main() {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = leia.nextLine();
        System.out.println("Digite seu ano de nascimento:");
        int anodeNascimento = leia.nextInt();
int anoAtual = 2026;
int idade = anoAtual - anodeNascimento;

        System.out.println("Olá, " + nome + " você tem " + idade + " anos de idade");





    }
}










