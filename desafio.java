import java.util.Scanner;
import java.util.InputMismatchException;

public class desafio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("Olá! Bem-vindo(a) ao explorador do Sistema Financeiro Nacional do Brasil.");
        System.out.println("Aqui você pode conhecer 18 tipos de instituições supervisionadas pelo Banco Central do Brasil (BCB).");
        System.out.println("Vamos começar!");

        while (continuar) {
            exibirMenuPrincipal();
            try {
                int opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        exibirTiposDeInstituicoes();
                        break;
                    case 2:
                        System.out.println("O Sistema Financeiro Nacional (SFN) é fundamental para a economia do país. Ele é composto por instituições, como bancos e cooperativas de crédito, que permitem a intermediação de recursos, ou seja, captam dinheiro de quem tem e emprestam para quem precisa. É por meio dele que transações financeiras acontecem, investimentos são realizados e a economia se movimenta.");
                        break;
                    case 3:
                        System.out.println("Obrigado(a) por explorar o mundo do Sistema Financeiro. Até a próxima!");
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, escolha uma das opções do menu.");
                }

                if (continuar) {
                    System.out.println("\nPressione Enter para continuar...");
                    scanner.nextLine();
                }

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }

    public static void exibirMenuPrincipal() {
        System.out.println("\n--- Menu Principal ---");
        System.out.println("1. Listar os 18 tipos de instituições do SFN");
        System.out.println("2. O que é o Sistema Financeiro Nacional?");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static void exibirTiposDeInstituicoes() {
        System.out.println("\n--- Tipos de Instituições do SFN ---");
        System.out.println("1. Bancos Múltiplos");
        System.out.println("2. Bancos Comerciais");
        System.out.println("3. Bancos de Investimento");
        System.out.println("4. Bancos de Desenvolvimento");
        System.out.println("5. Caixas Econômicas");
        System.out.println("6. Cooperativas de Crédito");
        System.out.println("7. Sociedades de Crédito, Financiamento e Investimento (Financeiras)");
        System.out.println("8. Sociedades de Crédito Imobiliário");
        System.out.println("9. Companhias Hipotecárias");
        System.out.println("10. Agências de Fomento");
        System.out.println("11. Sociedades de Arrendamento Mercantil (Leasing)");
        System.out.println("12. Sociedades Corretoras de Títulos e Valores Mobiliários (CTVMS)");
        System.out.println("13. Sociedades Distribuidoras de Títulos e Valores Mobiliários (DTVMS)");
        System.out.println("14. Corretoras de Câmbio");
        System.out.println("15. Instituições de Pagamento");
        System.out.println("16. Associações de Poupança e Empréstimo (APEs)");
        System.out.println("17. Bolsas de Valores");
        System.out.println("18. Bolsas de Mercadorias e Futuros");
    }
}