import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Exercício 1 - Dia da semana
            System.out.println("---");
            System.out.println("Exercício 1: Digite um número de 1 a 7:");
            int dia = scanner.nextInt();
            switch (dia) {
                case 1: System.out.println("Domingo"); break;
                case 2: System.out.println("Segunda-feira"); break;
                case 3: System.out.println("Terça-feira"); break;
                case 4: System.out.println("Quarta-feira"); break;
                case 5: System.out.println("Quinta-feira"); break;
                case 6: System.out.println("Sexta-feira"); break;
                case 7: System.out.println("Sábado"); break;
                default: System.out.println("Número inválido!"); break;
            }

            // Exercício 2 - Nome do mês
            System.out.println("\n---");
            System.out.println("Exercício 2: Digite um número de 1 a 12:");
            int mes = scanner.nextInt();
            switch (mes) {
                case 1: System.out.println("Janeiro"); break;
                case 2: System.out.println("Fevereiro"); break;
                case 3: System.out.println("Março"); break;
                case 4: System.out.println("Abril"); break;
                case 5: System.out.println("Maio"); break;
                case 6: System.out.println("Junho"); break;
                case 7: System.out.println("Julho"); break;
                case 8: System.out.println("Agosto"); break;
                case 9: System.out.println("Setembro"); break;
                case 10: System.out.println("Outubro"); break;
                case 11: System.out.println("Novembro"); break;
                case 12: System.out.println("Dezembro"); break;
                default: System.out.println("Número inválido!"); break;
            }
            
            // Exercício 3 - Saudação por período
            System.out.println("\n---");
            System.out.println("Exercício 3: Digite o período (M - Matutino, V - Vespertino, N - Noturno):");
            char periodo = scanner.next().toUpperCase().charAt(0);
            switch (periodo) {
                case 'M': System.out.println("Bom dia!"); break;
                case 'V': System.out.println("Boa tarde!"); break;
                case 'N': System.out.println("Boa noite!"); break;
                default: System.out.println("Opção inválida!"); break;
            }

            // Exercício 4 - Aumento salarial
            System.out.println("\n---");
            System.out.println("Exercício 4: Digite o plano de trabalho (A, B ou C):");
            char plano = scanner.next().toUpperCase().charAt(0);
            System.out.println("Digite o salário atual:");
            double salario = scanner.nextDouble();
            switch (plano) {
                case 'A': salario *= 1.10; break;
                case 'B': salario *= 1.15; break;
                case 'C': salario *= 1.20; break;
                default: System.out.println("Plano inválido!"); break;
            }
            System.out.println("Novo salário: R$ " + String.format("%.2f", salario));

            // Exercício 5 - Operações com dois números
            System.out.println("\n---");
            System.out.println("Exercício 5: Digite dois números:");
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            System.out.println("Escolha a operação (M - Média, S - Diferença, P - Produto, D - Divisão):");
            char opcao = scanner.next().toUpperCase().charAt(0);
            switch (opcao) {
                case 'M': System.out.println("Média: " + ((num1 + num2) / 2)); break;
                case 'S': System.out.println("Diferença: " + Math.abs(num1 - num2)); break;
                case 'P': System.out.println("Produto: " + (num1 * num2)); break;
                case 'D':
                    if (num2 != 0) {
                        System.out.println("Divisão: " + (num1 / num2));
                    } else {
                        System.out.println("Erro: divisão por zero!");
                    }
                    break;
                default: System.out.println("Opção inválida!"); break;
            }

            // Exercício 6 - Cardápio da lanchonete
            System.out.println("\n---");
            Map<Integer, String[]> menu = new HashMap<>();
            menu.put(100, new String[]{"Cachorro Quente", "1.20"});
            menu.put(101, new String[]{"Bauru Simples", "1.30"});
            menu.put(102, new String[]{"Bauru com ovo", "1.50"});
            menu.put(103, new String[]{"Hambúrguer", "1.20"});
            menu.put(104, new String[]{"Cheeseburguer", "1.30"});
            menu.put(105, new String[]{"Refrigerante", "1.00"});
            
            System.out.print("Exercício 6: Digite o código do produto: ");
            int productCode = scanner.nextInt();

            System.out.print("Digite a quantidade: ");
            int quantity = scanner.nextInt();

            if (menu.containsKey(productCode)) {
                String[] productInfo = menu.get(productCode);
                String productName = productInfo[0];
                double productPrice = Double.parseDouble(productInfo[1]);
                
                double totalValue = productPrice * quantity;

                System.out.println("\nNome do produto: " + productName);
                System.out.printf("Valor a ser pago: R$ %.2f\n", totalValue);
            } else {
                System.out.println("Código do produto inválido. Por favor, tente novamente.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de digitar números para os valores solicitados.");
        } finally {
            scanner.close();
        }
    }
}
