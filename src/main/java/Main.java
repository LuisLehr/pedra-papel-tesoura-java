// Imports do programa
import java.util.Random;
import java.util.Scanner;

// Inicio da classe Main
public class Main {

    public static void main(String[] args) {
        // Iniciando as variaveis do programa
        int usuario = 1;
        int sistema = 0;
        int op = 1;
        int vitoria = 0;
        int empate = 0;
        int derrota = 0;

        // Iniciando o Scanner para fazer a leitura do teclado
        Scanner Teclado = new Scanner(System.in);

        // Iniciando uma variavel Random para
        Random numeroSistema = new Random();

        // Cabeçalho de boas vindas
        System.out.println("================================");
        System.out.println("        SEJA BEM VINDO AO");
        System.out.println("       PEDRA-PAPEL-TESOURA");
        System.out.println("================================");

        // Loop while para jogar enquanto o jogador desejar
        while (op == 1) {
            // Menu para selecionar a jogada desejada
            System.out.println(" ");
            System.out.println("Escolha sua jogada!");
            System.out.println("[1] Pedra");
            System.out.println("[2] Papel");
            System.out.println("[3] Tesoura");
            System.out.println("[4] Sair");
            System.out.print("Digite a jogada desejada: ");
            usuario = Teclado.nextInt();

            // Print carregando com sleep
            System.out.println(" ");
            System.out.print("Carregando");

            // Adicionar os três pontos com um delay entre eles
            for (int i = 0; i < 3; i++) {
                try {
                    Thread.sleep(300);  // Pausa de um terço segundo (300 milissegundos)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print(".");  // Exibe um ponto
            }

            System.out.println(" ");  // Quebra de linha após os pontos

            // Loop while para o usuario sempre digitar uma opção válida
            while (usuario < 1 || usuario > 4) {
                System.out.println("------------------");
                System.out.println("  OPÇÃO INVÁLIDA");
                System.out.println("------------------");
                System.out.println("Escolha sua jogada!");
                System.out.println("[1] Pedra");
                System.out.println("[2] Papel");
                System.out.println("[3] Tesoura");
                System.out.println("[4] Sair");
                System.out.print("Digite a jogada desejada: ");
                usuario = Teclado.nextInt();
            }

            // A varivel sistema recebe um número aleatorio entre 0 e 3 para jogar aleatoriamente contra o jogador
            sistema = numeroSistema.nextInt(3)+1;


            if (usuario == 1 && sistema == 3) {
                vitoria++;
                System.out.println(" ");
                System.out.println("===================================================================================");
                System.out.println(" Você jogou:                                                O sistema jogou:");
                System.out.println("    PEDRA                                                        TESOURA");
                System.out.println("    _______" + "                                              " + "        _______   \n" +
                        "---'   ____)" + "                                              " + "  ____(____   '--- \n" +
                        "      (_____)" + "                RESULTADO DO JOGO           " + " (______          \n" +
                        "      (_____)" + "               --- VOCÊ GANHOU ---           " + "(__________       \n" +
                        "      (____)" + "                                              " + "     (____)      \n" +
                        "---.__(___)" + "                                              " + "      (___)__.---\n"
                );
                System.out.println("===================================================================================");
                System.out.println("                                ---PLACAR---");
                System.out.println("       VITÓRIAS                    EMPATES                                  DERROTAS");
                System.out.println("          "+vitoria+"                          "+empate+"                                        "+derrota);
                System.out.println("===================================================================================");

                // Verificando se o usuario quer jogar de novo
                System.out.println(" ");
                System.out.println("Deseja jogar novamente?");
                System.out.println("[1] Jogar novamente");
                System.out.println("[2] Sair");
                System.out.print("Digite a opção desejada: ");
                op = Teclado.nextInt();

                while (op < 1 || op > 2){
                    System.out.println(" ");
                    System.out.println("---DIGITE UMA OPÇÃO VÁLIDA---");
                    System.out.println("Deseja jogar novamente?");
                    System.out.println("[1] Jogar novamente");
                    System.out.println("[2] Sair");
                    System.out.print("Digite a opção desejada: ");
                    op = Teclado.nextInt();
                }

                if (op == 2) {
                    System.out.println("-----------------------");
                    System.out.println("  Programa finalizado!");
                    System.out.println("-----------------------");
                    break;
                }
            }

            if (usuario== 1 && sistema == 2) {
                derrota++;
                System.out.println(" ");
                System.out.println("===================================================================================");
                System.out.println(" Você jogou:                                                O sistema jogou:");
                System.out.println("    PEDRA                                                        PAPEL");
                System.out.println("    _______" + "                                              " + "       _______   \n" +
                        "---'   ____)" + "                                              " + " ____(____   '--- \n" +
                        "      (_____)" + "                RESULTADO DO JOGO           " + " (______          \n" +
                        "      (_____)" + "               --- VOCÊ PERDEU ---           " + "(_______          \n" +
                        "      (____)" + "                                              " + " (_______         \n" +
                        "---.__(___)" + "                                              " + "   (__________.---\n"
                );
                System.out.println("===================================================================================");
                System.out.println("                                ---PLACAR---");
                System.out.println("       VITÓRIAS                    EMPATES                                  DERROTAS");
                System.out.println("          "+vitoria+"                           "+empate+"                                        "+derrota);
                System.out.println("===================================================================================");

                // Verificando se o usuario quer jogar de novo
                System.out.println(" ");
                System.out.println("Deseja jogar novamente?");
                System.out.println("[1] Jogar novamente");
                System.out.println("[2] Sair");
                System.out.print("Digite a opção desejada: ");
                op = Teclado.nextInt();

                while (op < 1 || op > 2){
                    System.out.println(" ");
                    System.out.println("---DIGITE UMA OPÇÃO VÁLIDA---");
                    System.out.println("Deseja jogar novamente?");
                    System.out.println("[1] Jogar novamente");
                    System.out.println("[2] Sair");
                    System.out.print("Digite a opção desejada: ");
                    op = Teclado.nextInt();
                }

                if (op == 2) {
                    System.out.println("-----------------------");
                    System.out.println("  Programa finalizado!");
                    System.out.println("-----------------------");
                    break;
                }
            }

            if (usuario == 1 && sistema == 1) {
                empate++;
                System.out.println(" ");
                System.out.println("===================================================================================");
                System.out.println(" Você jogou:                                                O sistema jogou:");
                System.out.println("    PEDRA                                                         PEDRA");
                System.out.println("    _______" + "                                              " + "        _______\n" +
                        "---'   ____)" + "                                              " + "      (____   '--- \n" +
                        "      (_____)" + "                RESULTADO DO JOGO             " + "    (_____)      \n" +
                        "      (_____)" + "                 --- EMPATE ---               " + "    (_____)      \n" +
                        "      (____)" + "                                              " + "      (____)      \n" +
                        "---.__(___)" + "                                              " + "        (___)__.---\n"
                );
                System.out.println("===================================================================================");
                System.out.println("                                ---PLACAR---");
                System.out.println("       VITÓRIAS                    EMPATES                                  DERROTAS");
                System.out.println("          "+vitoria+"                           "+empate+"                                        "+derrota);
                System.out.println("===================================================================================");

                // Verificando se o usuario quer jogar de novo
                System.out.println(" ");
                System.out.println("Deseja jogar novamente?");
                System.out.println("[1] Jogar novamente");
                System.out.println("[2] Sair");
                System.out.print("Digite a opção desejada: ");
                op = Teclado.nextInt();

                while (op < 1 || op > 2){
                    System.out.println(" ");
                    System.out.println("---DIGITE UMA OPÇÃO VÁLIDA---");
                    System.out.println("Deseja jogar novamente?");
                    System.out.println("[1] Jogar novamente");
                    System.out.println("[2] Sair");
                    System.out.print("Digite a opção desejada: ");
                    op = Teclado.nextInt();
                }

                if (op == 2) {
                    System.out.println("-----------------------");
                    System.out.println("  Programa finalizado!");
                    System.out.println("-----------------------");
                    break;
                }
            }

            if (usuario == 2 && sistema == 3) {
                derrota++;
                System.out.println(" ");
                System.out.println("===================================================================================");
                System.out.println(" Você jogou:                                                O sistema jogou:");
                System.out.println("    PAPEL                                                        TESOURA");
                System.out.println("    _______" + "                                                  " + "         _______\n" +
                        "---'   ____)____" + "                                              " + "   ____(____   '--- \n" +
                        "          ______)" + "                RESULTADO DO JOGO             " + "(______          \n" +
                        "          _______)" + "              --- VOCÊ PERDEU ---            " + "(__________       \n" +
                        "         _______)" + "                                              " + "     (____)      \n" +
                        "---.__________)" + "                                              " + "       (___)__.---\n"
                );
                System.out.println("===================================================================================");
                System.out.println("                                ---PLACAR---");
                System.out.println("       VITÓRIAS                    EMPATES                                  DERROTAS");
                System.out.println("          "+vitoria+"                           "+empate+"                                        "+derrota);
                System.out.println("===================================================================================");

                // Verificando se o usuario quer jogar de novo
                System.out.println(" ");
                System.out.println("Deseja jogar novamente?");
                System.out.println("[1] Jogar novamente");
                System.out.println("[2] Sair");
                System.out.print("Digite a opção desejada: ");
                op = Teclado.nextInt();

                while (op < 1 || op > 2){
                    System.out.println(" ");
                    System.out.println("---DIGITE UMA OPÇÃO VÁLIDA---");
                    System.out.println("Deseja jogar novamente?");
                    System.out.println("[1] Jogar novamente");
                    System.out.println("[2] Sair");
                    System.out.print("Digite a opção desejada: ");
                    op = Teclado.nextInt();
                }

                if (op == 2) {
                    System.out.println("-----------------------");
                    System.out.println("  Programa finalizado!");
                    System.out.println("-----------------------");
                    break;
                }
            }

            if (usuario == 2 && sistema == 1) {
                vitoria++;
                System.out.println(" ");
                System.out.println("===================================================================================");
                System.out.println(" Você jogou:                                                O sistema jogou:");
                System.out.println("    PAPEL                                                         PEDRA");
                System.out.println("    _______" + "                                          " + "            _______\n" +
                        "---'   ____)____" + "                                                " + "(____   '--- \n" +
                        "          ______)" + "                RESULTADO DO JOGO             " + "(_____)      \n" +
                        "          _______)" + "              --- VOCÊ GANHOU ---           " + " (_____)      \n" +
                        "         _______)" + "                                              " + " (____)      \n" +
                        "---.__________)" + "                                              " + "    (___)__.---\n"
                );
                System.out.println("===================================================================================");
                System.out.println("                                ---PLACAR---");
                System.out.println("       VITÓRIAS                    EMPATES                                  DERROTAS");
                System.out.println("          "+vitoria+"                           "+empate+"                                        "+derrota);
                System.out.println("===================================================================================");

                // Verificando se o usuario quer jogar de novo
                System.out.println(" ");
                System.out.println("Deseja jogar novamente?");
                System.out.println("[1] Jogar novamente");
                System.out.println("[2] Sair");
                System.out.print("Digite a opção desejada: ");
                op = Teclado.nextInt();

                while (op < 1 || op > 2){
                    System.out.println(" ");
                    System.out.println("---DIGITE UMA OPÇÃO VÁLIDA---");
                    System.out.println("Deseja jogar novamente?");
                    System.out.println("[1] Jogar novamente");
                    System.out.println("[2] Sair");
                    System.out.print("Digite a opção desejada: ");
                    op = Teclado.nextInt();
                }

                if (op == 2) {
                    System.out.println("-----------------------");
                    System.out.println("  Programa finalizado!");
                    System.out.println("-----------------------");
                    break;
                }
            }

            if (usuario == 2 && sistema == 2) {
                empate++;
                System.out.println(" ");
                System.out.println("===================================================================================");
                System.out.println(" Você jogou:                                                  O sistema jogou:");
                System.out.println("    PAPEL                                                           PAPEL");
                System.out.println("    _______" + "                                                  " + "       _______   \n" +
                        "---'   ____)____" + "                                              " + " ____(____   '--- \n" +
                        "          ______)" + "               RESULTADO DO JOGO            " + " (______          \n" +
                        "          _______)" + "               --- EMPATE ---               " + "(_______          \n" +
                        "         _______)" + "                                             " + " (_______         \n" +
                        "---.__________)" + "                                              " + "   (__________.---\n"
                );
                System.out.println("===================================================================================");
                System.out.println("                                ---PLACAR---");
                System.out.println("       VITÓRIAS                    EMPATES                                  DERROTAS");
                System.out.println("          "+vitoria+"                           "+empate+"                                        "+derrota);
                System.out.println("===================================================================================");

                // Verificando se o usuario quer jogar de novo
                System.out.println(" ");
                System.out.println("Deseja jogar novamente?");
                System.out.println("[1] Jogar novamente");
                System.out.println("[2] Sair");
                System.out.print("Digite a opção desejada: ");
                op = Teclado.nextInt();

                while (op < 1 || op > 2){
                    System.out.println(" ");
                    System.out.println("---DIGITE UMA OPÇÃO VÁLIDA---");
                    System.out.println("Deseja jogar novamente?");
                    System.out.println("[1] Jogar novamente");
                    System.out.println("[2] Sair");
                    System.out.print("Digite a opção desejada: ");
                    op = Teclado.nextInt();
                }

                if (op == 2) {
                    System.out.println("-----------------------");
                    System.out.println("  Programa finalizado!");
                    System.out.println("-----------------------");
                    break;
                }
            }

            if (usuario == 3 && sistema == 1) {
                derrota++;
                System.out.println(" ");
                System.out.println("===================================================================================");
                System.out.println(" Você jogou:                                                O sistema jogou:");
                System.out.println("   TESOURA                                                        PEDRA");
                System.out.println("    _______" + "                                                  " + "    _______\n" +
                        "---'   ____)____" + "                                          " + "      (____   '--- \n" +
                        "          ______)" + "                RESULTADO DO JOGO            " + " (_____)      \n" +
                        "       __________)" + "              --- VOCÊ PERDEU ---        " + "    (_____)      \n" +
                        "      (____)" + "                                              " + "      (____)      \n" +
                        "---.__(___)" + "                                              " + "        (___)__.---\n"
                );
                System.out.println("===================================================================================");
                System.out.println("                                ---PLACAR---");
                System.out.println("       VITÓRIAS                    EMPATES                                  DERROTAS");
                System.out.println("          "+vitoria+"                           "+empate+"                                        "+derrota);
                System.out.println("===================================================================================");

                // Verificando se o usuario quer jogar de novo
                System.out.println(" ");
                System.out.println("Deseja jogar novamente?");
                System.out.println("[1] Jogar novamente");
                System.out.println("[2] Sair");
                System.out.print("Digite a opção desejada: ");
                op = Teclado.nextInt();

                while (op < 1 || op > 2){
                    System.out.println(" ");
                    System.out.println("---DIGITE UMA OPÇÃO VÁLIDA---");
                    System.out.println("Deseja jogar novamente?");
                    System.out.println("[1] Jogar novamente");
                    System.out.println("[2] Sair");
                    System.out.print("Digite a opção desejada: ");
                    op = Teclado.nextInt();
                }

                if (op == 2) {
                    System.out.println("-----------------------");
                    System.out.println("  Programa finalizado!");
                    System.out.println("-----------------------");
                    break;
                }
            }

            if (usuario == 3 && sistema == 2) {
                vitoria++;
                System.out.println(" ");
                System.out.println("===================================================================================");
                System.out.println(" Você jogou:                                                O sistema jogou:");
                System.out.println("   TESOURA                                                        PAPEL");
                System.out.println("    _______" + "                                                    " + "     _______   \n" +
                        "---'   ____)____" + "                                              " + " ____(____   '--- \n" +
                        "          ______)" + "                RESULTADO DO JOGO           " + " (______          \n" +
                        "       __________)" + "              --- VOCÊ GANHOU ---           " + "(_______          \n" +
                        "      (____)" + "                                                  " + " (_______         \n" +
                        "---.__(___)" + "                                                  " + "   (__________.---\n"
                );
                System.out.println("===================================================================================");
                System.out.println("                                ---PLACAR---");
                System.out.println("       VITÓRIAS                    EMPATES                                  DERROTAS");
                System.out.println("          "+vitoria+"                           "+empate+"                                        "+derrota);
                System.out.println("===================================================================================");

                // Verificando se o usuario quer jogar de novo
                System.out.println(" ");
                System.out.println("Deseja jogar novamente?");
                System.out.println("[1] Jogar novamente");
                System.out.println("[2] Sair");
                System.out.print("Digite a opção desejada: ");
                op = Teclado.nextInt();

                while (op < 1 || op > 2){
                    System.out.println(" ");
                    System.out.println("---DIGITE UMA OPÇÃO VÁLIDA---");
                    System.out.println("Deseja jogar novamente?");
                    System.out.println("[1] Jogar novamente");
                    System.out.println("[2] Sair");
                    System.out.print("Digite a opção desejada: ");
                    op = Teclado.nextInt();
                }

                if (op == 2) {
                    System.out.println("-----------------------");
                    System.out.println("  Programa finalizado!");
                    System.out.println("-----------------------");
                    break;
                }
            }

            if (usuario == 3 && sistema == 3) {
                empate++;
                System.out.println(" ");
                System.out.println("===================================================================================");
                System.out.println(" Você jogou:                                                O sistema jogou:");
                System.out.println("   TESOURA                                                       TESOURA");
                System.out.println("    _______" + "                                                  " + "         _______\n" +
                        "---'   ____)____" + "                                               " + "  ____(____   '--- \n" +
                        "          ______)" + "                RESULTADO DO JOGO             " + "(______          \n" +
                        "       __________)" + "                 --- EMPATE ---              " + "(__________       \n" +
                        "      (____)" + "                                                    " + "    (____)      \n" +
                        "---.__(___)" + "                                                   " + "      (___)__.---\n"
                );
                System.out.println("===================================================================================");
                System.out.println("                                ---PLACAR---");
                System.out.println("       VITÓRIAS                    EMPATES                                  DERROTAS");
                System.out.println("          "+vitoria+"                           "+empate+"                                        "+derrota);
                System.out.println("===================================================================================");

                // Verificando se o usuario quer jogar de novo
                System.out.println(" ");
                System.out.println("Deseja jogar novamente?");
                System.out.println("[1] Jogar novamente");
                System.out.println("[2] Sair");
                System.out.print("Digite a opção desejada: ");
                op = Teclado.nextInt();

                while (op < 1 || op > 2){
                    System.out.println(" ");
                    System.out.println("---DIGITE UMA OPÇÃO VÁLIDA---");
                    System.out.println("Deseja jogar novamente?");
                    System.out.println("[1] Jogar novamente");
                    System.out.println("[2] Sair");
                    System.out.print("Digite a opção desejada: ");
                    op = Teclado.nextInt();
                }

                if (op == 2) {
                    System.out.println("-----------------------");
                    System.out.println("  Programa finalizado!");
                    System.out.println("-----------------------");
                    break;
                }
            }
        }
    }
}
