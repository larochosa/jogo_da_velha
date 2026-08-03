import java.util.Scanner;
import java.util.Random;

public class main {

    static final char JOGADOR = 'X';
    static final char COMPUTADOR = 'O';
    static final char VAZIO = ' ';

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    static int jogadas = 0;

    public static void main(String[] args) {
        char[][] tabuleiro = criarTabuleiro();
        iniciarJogo(tabuleiro);
    }

    public static char[][] criarTabuleiro() {
        char[][] tabuleiro = new char[3][3];

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                tabuleiro[linha][coluna] = VAZIO;
            }
        }

        return tabuleiro;
    }

    public static void exibirTabuleiro(char[][] tabuleiro) {
        System.out.println("\n===== JOGO DA VELHA =====");

        for (int linha = 0; linha < 3; linha++) {

            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print(" " + tabuleiro[linha][coluna] + " ");

                if (coluna < 2) {
                    System.out.print("|");
                }
            }

            System.out.println();

            if (linha < 2) {
                System.out.println("---+---+---");
            }
        }

        System.out.println();
    }

    public static void jogadaDoJogador(char[][] tabuleiro) {

        while (true) {

            System.out.print("Escolha a linha (0, 1 ou 2): ");
            int linha = lerNumero();

            System.out.print("Escolha a coluna (0, 1 ou 2): ");
            int coluna = lerNumero();

            if (posicaoInvalida(linha, coluna)) {
                System.out.println("Essa posição não existe! Tente novamente.");
                continue;
            }

            if (tabuleiro[linha][coluna] != VAZIO) {
                System.out.println("Esse espaço já está ocupado!");
                continue;
            }

            tabuleiro[linha][coluna] = JOGADOR;
            jogadas++;

            System.out.println(" Jogada realizada!");
            break;
        }
    }

    public static boolean posicaoInvalida(int linha, int coluna) {
        return linha < 0 || linha >= 3 || coluna < 0 || coluna >= 3;
    }

    public static int lerNumero() {

        while (!scanner.hasNextInt()) {
            System.out.println("Digite somente números!");
            scanner.next();
        }

        return scanner.nextInt();
    }

    public static void jogadaDoComputador(char[][] tabuleiro) {

        int linha;
        int coluna;

        do {
            linha = random.nextInt(3);
            coluna = random.nextInt(3);

        } while (tabuleiro[linha][coluna] != VAZIO);

        tabuleiro[linha][coluna] = COMPUTADOR;
        jogadas++;

        System.out.println(
                " O computador marcou: linha " + linha + ", coluna " + coluna
        );
    }

    public static void iniciarJogo(char[][] tabuleiro) {

        System.out.println("Bem-vindo ao Jogo da Velha!");
        System.out.println("Você é X e o computador é O.\n");

        while (true) {

            exibirTabuleiro(tabuleiro);

            // Jogada do jogador
            jogadaDoJogador(tabuleiro);

            if (verificarVitoria(tabuleiro, JOGADOR)) {
                exibirTabuleiro(tabuleiro);
                System.out.println("🎉 Parabéns! Você ganhou em " + jogadas + " jogadas!");
                break;
            }

            if (verificarEmpate(tabuleiro)) {
                exibirTabuleiro(tabuleiro);
                System.out.println(" O jogo terminou empatado!");
                break;
            }

            // Jogada do computador
            jogadaDoComputador(tabuleiro);

            if (verificarVitoria(tabuleiro, COMPUTADOR)) {
                exibirTabuleiro(tabuleiro);
                System.out.println("O computador ganhou!");
                break;
            }

            if (verificarEmpate(tabuleiro)) {
                exibirTabuleiro(tabuleiro);
                System.out.println(" O jogo terminou empatado!");
                break;
            }
        }

        perguntarNovaPartida(tabuleiro);
    }

    public static void perguntarNovaPartida(char[][] tabuleiro) {
        System.out.print("\nDeseja jogar novamente? (sim/nao): ");
        String resposta = scanner.next().trim().toLowerCase();

        if (resposta.equals("sim")) {
            jogadas = 0;
            char[][] novoTabuleiro = criarTabuleiro();
            iniciarJogo(novoTabuleiro);
        } else {
            System.out.println("Obrigado por jogar!");
            scanner.close();
        }
    }

    public static boolean verificarVitoria(char[][] tabuleiro, char jogador) {

        // Verifica linhas e colunas
        for (int i = 0; i < 3; i++) {

            // Linha
            if (tabuleiro[i][0] == jogador &&
                    tabuleiro[i][1] == jogador &&
                    tabuleiro[i][2] == jogador) {

                return true;
            }

            // Coluna
            if (tabuleiro[0][i] == jogador &&
                    tabuleiro[1][i] == jogador &&
                    tabuleiro[2][i] == jogador) {

                return true;
            }
        }

        // Diagonal principal
        if (tabuleiro[0][0] == jogador &&
                tabuleiro[1][1] == jogador &&
                tabuleiro[2][2] == jogador) {

            return true;
        }

        // Diagonal secundária
        if (tabuleiro[0][2] == jogador &&
                tabuleiro[1][1] == jogador &&
                tabuleiro[2][0] == jogador) {

            return true;
        }

        return false;
    }

    public static boolean verificarEmpate(char[][] tabuleiro) {

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {

                if (tabuleiro[linha][coluna] == VAZIO) {
                    return false;
                }
            }
        }

        return true;
    }
}