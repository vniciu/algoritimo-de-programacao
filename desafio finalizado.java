import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {


    static class Cenário {
        String titulo;
        String descricao;
        String[] opcoes;
        int opcaoCorreta;
        String feedbackCorreto;
        String feedbackIncorreto;

        Cenário(String titulo, String descricao, String[] opcoes, int opcaoCorreta, String feedbackCorreto, String feedbackIncorreto) {
            this.titulo = titulo;
            this.descricao = descricao;
            this.opcoes = opcoes;
            this.opcaoCorreta = opcaoCorreta;
            this.feedbackCorreto = feedbackCorreto;
            this.feedbackIncorreto = feedbackIncorreto;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

     
        Map<Integer, Cenário> cenarios = new HashMap<>();
        cenarios.put(1, new Cenário(
            "O Golpe do Falso Entregador",
            "Um motoboy toca a campainha, dizendo que é do seu banco e precisa recolher seu cartão, que foi 'clonado'. Ele diz que vai destruí-lo na sua frente.",
            new String[]{
                "Entregar o cartão e digitar a senha na maquininha dele.",
                "Recusar a entrega, triturar o cartão e ligar para o número oficial do banco.",
                "Entregar o cartão, mas dizer que não sabe a senha.",
                "Permitir que ele tire uma foto sua para 'verificação de segurança'."
            },
            2,
            " Resposta correta! Nenhum banco envia motoboys para recolher cartões. Ao se recusar e ligar para o banco, você evita o golpe.",
            " Resposta incorreta! Entregar o cartão ou fornecer informações pessoais é perigoso. O golpista leva seu chip e faz transações com ele."
        ));

        cenarios.put(2, new Cenário(
            "O Golpe do Boleto Estranho",
            "Você recebe um boleto por e-mail, mas o nome do beneficiário e o banco parecem diferentes do que você esperava. Há um QR Code no boleto.",
            new String[]{
                "Escanear o QR Code e pagar imediatamente para não perder o prazo.",
                "Ligar para o número de telefone que está no próprio boleto para confirmar as informações.",
                "Não pagar e entrar em contato diretamente com a empresa através dos canais oficiais (site, aplicativo, etc.).",
                "Pagar o boleto, mas guardar o comprovante para reclamar depois."
            },
            3,
            " Resposta correta! Você evitou o golpe. O nome do beneficiário deve sempre ser o mesmo da empresa que emitiu a cobrança. Contatar a fonte oficial é a melhor opção.",
            " Resposta incorreta! Escanear o QR Code ou ligar para o telefone do boleto pode levar você a cair no golpe, pois o golpista está no controle. Sempre verifique os dados de contato em fontes oficiais."
        ));

        cenarios.put(3, new Cenário(
            "O Golpe da Central de Atendimento Falsa",
            "O seu celular toca. É uma ligação de uma suposta central de segurança do seu banco. A pessoa do outro lado diz que detectou uma compra suspeita e pede para você confirmar seus dados e sua senha para cancelá-la.",
            new String[]{
                "Confirmar seus dados para 'ajudar' a central a bloquear a compra fraudulenta.",
                "Desligar imediatamente e ligar para o número oficial do seu banco que está no seu cartão ou no site.",
                "Seguir as instruções deles e fazer um procedimento no seu aplicativo.",
                "Ignorar a ligação e esperar que o banco resolva o problema por conta própria."
            },
            2,
            " Resposta correta! Você se protegeu. Bancos nunca pedem senhas ou dados pessoais por telefone. O ideal é sempre desligar e ligar para um canal oficial de sua confiança.",
            " Resposta incorreta! Você está correndo um sério risco. Os golpistas usam essa tática para roubar seus dados e acessar sua conta. O banco nunca solicita sua senha ou pede para fazer procedimentos no aplicativo por telefone."
        ));

        cenarios.put(4, new Cenário(
            "O Pacote Misterioso",
            "Um entregador aparece na sua porta com um pacote, dizendo que é um presente surpresa. Para recebê-lo, você só precisa pagar uma pequena taxa de entrega e tirar uma foto 'para confirmar a entrega'.",
            new String[]{
                "Pagar a taxa e tirar a foto.",
                "Recusar o pacote e dizer que não esperava nada.",
                "Pagar a taxa, mas recusar a foto.",
                "Dizer que vai ligar para a empresa para confirmar."
            },
            2,
            " Resposta correta! Você evitou o golpe. Pacotes inesperados que exigem pagamento ou fotos são táticas de golpistas para obter dinheiro ou dados pessoais.",
            " Resposta incorreta! Ao pagar ou permitir a foto, você pode estar fornecendo dinheiro ou dados biométricos que serão usados para abrir contas ou fazer empréstimos em seu nome."
        ));

        cenarios.put(5, new Cenário(
            "O Empréstimo Milagroso",
            "Você vê um anúncio online de uma empresa que oferece um empréstimo com juros baixíssimos, sem necessidade de consulta ao SPC/Serasa. Para 'liberar o valor', eles pedem um 'depósito de seguro' antecipado.",
            new String[]{
                "Fazer o depósito, pois a oferta é irrecusável.",
                "Ligar para o seu banco para verificar a idoneidade da empresa.",
                "Desconfiar da oferta, pois bancos sérios não pedem dinheiro adiantado.",
                "Fazer uma reclamação no Procon antes de fazer o depósito."
            },
            3,
            " Resposta correta! Você se protegeu. Empresas sérias não solicitam pagamento antecipado para liberar empréstimos. Essa é uma característica comum de golpes.",
            " Resposta incorreta! Fazer o depósito adiantado é o que o golpista quer. O dinheiro nunca será devolvido, e o empréstimo nunca será liberado."
        ));

        cenarios.put(6, new Cenário(
            "O Carro dos Sonhos",
            "Você encontra um site de leilões online com um carro de luxo à venda por um preço inacreditavelmente baixo. O site parece profissional, mas é desconhecido. Eles pedem para você fazer um depósito para participar do leilão.",
            new String[]{
                "Fazer o depósito rapidamente para não perder a chance.",
                "Pesquisar sobre a empresa em sites de reclamação e verificar se ela existe fisicamente.",
                "Compartilhar a oferta com seus amigos para ver se eles conhecem o site.",
                "Desistir de comprar o carro."
            },
            2,
            " Resposta correta! Você evitou um golpe. Golpistas criam sites de leilões falsos com ofertas tentadoras para atrair vítimas. Sempre pesquise a reputação e a existência real da empresa antes de qualquer pagamento.",
            " Resposta incorreta! O preço baixo é a isca. Sites de leilões falsos são uma tática comum para roubar o dinheiro do depósito e desaparecer."
        ));

        cenarios.put(7, new Cenário(
            "A Mensagem de Texto Suspeita",
            "Você recebe um SMS do 'seu banco' informando sobre uma compra suspeita de alto valor. A mensagem tem um link para 'cancelar a transação'.",
            new String[]{
                "Clicar no link imediatamente para cancelar a compra.",
                "Ligar para o número de telefone que está no SMS para verificar a informação.",
                "Excluir a mensagem e ligar para o número oficial do banco.",
                "Ignorar a mensagem."
            },
            3,
            " Resposta correta! Você evitou o golpe de phishing. Bancos não enviam links para cancelar transações por SMS. A melhor atitude é sempre entrar em contato pelos canais oficiais.",
            " Resposta incorreta! Ao clicar no link, você pode ser direcionado a um site falso onde seus dados de acesso serão roubados. Nunca clique em links suspeitos."
        ));

        cenarios.put(8, new Cenário(
            "O Amigo em Apuros",
            "Você recebe uma mensagem no Facebook de um amigo que você não fala há anos. Ele diz que está em uma emergência e precisa de uma transferência de dinheiro urgente, pedindo para você depositar em uma conta de terceiro.",
            new String[]{
                "Fazer a transferência imediatamente para ajudar.",
                "Ligar para o amigo ou contatá-lo por outro meio (como WhatsApp) para confirmar a história.",
                "Dizer que não tem dinheiro.",
                "Pedir mais detalhes da história, como para que ele precisa do dinheiro."
            },
            2,
            " Resposta correta! Você desmascarou o golpista. Perfis falsos ou clonados de amigos são usados para pedir dinheiro com histórias urgentes. Sempre verifique a identidade da pessoa por outro meio de contato.",
            " Resposta incorreta! Ao fazer a transferência, você cai em um golpe. O perfil foi clonado e o dinheiro irá direto para a conta de um golpista."
        ));

        cenarios.put(9, new Cenário(
            "A Compra Desconhecida",
            "Você checa seu extrato bancário e vê uma compra de uma loja que você nunca visitou.",
            new String[]{
                "Esperar para ver se a compra desaparece no dia seguinte.",
                "Contestar a compra imediatamente no aplicativo do banco e registrar um Boletim de Ocorrência.",
                "Ligar para a loja para pedir o estorno.",
                "Ligar para o banco e pedir para eles cancelarem a compra."
            },
            2,
            " Resposta correta! Você agiu rapidamente. O primeiro passo para resolver uma transação não reconhecida é contestá-la no banco e fazer um B.O.",
            " Resposta incorreta! Esperar ou não tomar as medidas certas pode dificultar a recuperação do dinheiro. Contestar a compra oficialmente é a única forma de iniciar o processo de estorno."
        ));

        cenarios.put(10, new Cenário(
            "Dinheiro Esquecido",
            "Você recebe uma mensagem no WhatsApp com um link para um site 'oficial' do Banco Central, dizendo que você tem dinheiro 'esquecido' para receber.",
            new String[]{
                "Clicar no link para ver a quantia.",
                "Fazer uma busca no Google pelo site oficial do Banco Central para ver se a informação é verdadeira.",
                "Compartilhar o link com a família para que todos possam checar.",
                "Ligar para um parente que trabalha em um banco."
            },
            2,
            " Resposta correta! Você evitou o golpe. O único site para consultar valores a receber é o oficial do BCB (valoresareceber.bcb.gov.br). O BC não envia links por mensagem.",
            " Resposta incorreta! Clicar em links de mensagem é perigoso, pois o site pode ser falso e roubar seus dados pessoais ou bancários."
        ));

        cenarios.put(11, new Cenário(
            "Pedido de Código de Verificação",
            "Você recebe uma mensagem de texto de um número desconhecido que diz: 'Olá! Sou do WhatsApp. Para continuar usando o aplicativo, digite o código de verificação que enviamos para você.'",
            new String[]{
                "Digitar o código para o número que enviou a mensagem.",
                "Ignorar a mensagem e bloquear o número.",
                "Compartilhar o código com o seu melhor amigo.",
                "Ligar para o atendimento do WhatsApp para perguntar sobre a mensagem."
            },
            2,
            " Resposta correta! Golpistas usam essa tática para ativar sua conta do WhatsApp em outro aparelho, roubando seu número e usando-o para aplicar golpes em seus contatos.",
            " Resposta incorreta! Ao enviar o código, você está dando acesso à sua conta do WhatsApp para o golpista, que usará seu número para se passar por você."
        ));

        cenarios.put(12, new Cenário(
            "E-mail de Atualização Cadastral",
            "Você recebe um e-mail de um serviço de streaming (Netflix, por exemplo) dizendo que seu cadastro precisa ser atualizado, com um link para 'fazer login e atualizar seus dados' para evitar o cancelamento da conta.",
            new String[]{
                "Clicar no link e fazer o login com seus dados.",
                "Clicar no link, mas entrar com uma senha aleatória para testar.",
                "Acessar o site do serviço de streaming digitando o endereço na barra do navegador, sem usar o link do e-mail.",
                "Responder ao e-mail pedindo mais informações."
            },
            3,
            " Resposta correta! Você se protegeu. Essa é uma clássica tática de phishing. A melhor forma de se proteger é sempre acessar sites de serviços digitando o endereço diretamente, sem usar links de e-mail.",
            " Resposta incorreta! O link no e-mail pode te levar a um site falso idêntico ao original, onde suas informações de login serão roubadas."
        ));

        cenarios.put(13, new Cenário(
            "A Maquininha com Tela Congelada",
            "Você vai pagar uma compra. A maquininha parece estar com defeito, a tela congela e o vendedor diz que você precisa passar o cartão novamente, mas desta vez pedindo a senha.",
            new String[]{
                "Passar o cartão novamente e digitar a senha.",
                "Pedir para que o vendedor digite o valor de novo, conferindo no visor.",
                "Desistir da compra.",
                "Pagar com dinheiro ou Pix."
            },
            2,
            " Resposta correta! Você se protegeu. Essa é uma tática para fazer você passar o cartão e digitar a senha de novo, duplicando a transação. Conferir o valor no visor antes de qualquer pagamento é essencial.",
            " Resposta incorreta! Ao passar o cartão e digitar a senha novamente, você corre o risco de pagar a mesma compra duas vezes."
        ));

        cenarios.put(14, new Cenário(
            "A Ligação do Banco Central",
            "Você recebe uma ligação de uma pessoa que se identifica como funcionário do Banco Central, informando que você tem uma dívida antiga e precisa pagá-la em uma conta específica para regularizar a situação.",
            new String[]{
                "Fazer o pagamento para evitar problemas.",
                "Ligar para o seu banco para verificar se existe a dívida.",
                "Dizer que irá ligar para a ouvidoria do Banco Central para confirmar a informação.",
                "Discutir com a pessoa sobre a dívida."
            },
            3,
            " Resposta correta! O Banco Central não faz cobrança de dívidas nem pede dados por telefone. A atitude correta é sempre desconfiar e entrar em contato com a fonte oficial para confirmar a informação.",
            " Resposta incorreta! O golpista quer te pressionar a fazer um pagamento. Pagar ou fornecer informações sem verificar é perigoso."
        ));

        cenarios.put(15, new Cenário(
            "O Pix Devolvido",
            "Um estranho te liga, dizendo que fez um Pix por engano para sua conta. Ele pede que você devolva o dinheiro imediatamente.",
            new String[]{
                "Devolver o dinheiro sem questionar.",
                "Verificar no seu extrato se o valor realmente foi creditado e, se sim, devolver para a chave Pix original.",
                "Ignorar a ligação.",
                "Bloquear o número."
            },
            2,
            " Resposta correta! Você agiu com cautela. O golpe da falsa devolução de Pix é comum. Sempre verifique seu extrato e, se a transação for real, devolva para a chave de origem.",
            " Resposta incorreta! O golpe pode ser que o valor nunca tenha sido creditado, ou que a chave Pix para a qual você irá transferir seja de um terceiro. Sempre verifique o extrato."
        ));

        cenarios.put(16, new Cenário(
            "O Pedido de Socorro",
            "Você recebe uma mensagem no WhatsApp do seu sobrinho dizendo que o celular dele quebrou, ele está usando um número temporário e precisa de dinheiro para um conserto urgente.",
            new String[]{
                "Fazer o Pix para o número que ele enviou.",
                "Ligar para o número antigo do seu sobrinho para confirmar a história.",
                "Fazer o Pix, mas dizer que só vai devolver o dinheiro quando ele provar que é ele.",
                "Pedir para ele te ligar."
            },
            4,
            " Resposta correta! Você evitou o golpe. É uma tática de golpista se passar por alguém da família ou amigo com uma história urgente. Sempre peça para a pessoa te ligar ou confirme a história por outro meio de contato.",
            " Resposta incorreta! Fazer o Pix ou pedir para ele provar que é ele não garante nada. O golpista pode estar em outra cidade ou usar a foto da pessoa em um perfil falso. A melhor opção é sempre ligar para a pessoa e confirmar a história."
        ));

        cenarios.put(17, new Cenário(
            "A Falsa Notificação do Meu BC",
            "Você recebe um e-mail com uma notificação do 'Meu BC', dizendo que há um problema em seu cadastro e você precisa clicar em um link para regularizá-lo. O e-mail pede sua senha de acesso.",
            new String[]{
                "Acessar o link para resolver o problema.",
                "Fazer o login para resolver o problema.",
                "Desconfiar do e-mail e ligar para a ouvidoria do Banco Central.",
                "Acessar o site do Banco Central digitando o endereço oficial para verificar a informação."
            },
            4,
            " Resposta correta! Você evitou o golpe. O Banco Central não envia links por e-mail e não pede senhas. O único meio de acesso ao Meu BC é pelo site oficial.",
            " Resposta incorreta! Clicar no link e fornecer seus dados de acesso pode resultar no roubo de seus dados."
        ));

        cenarios.put(18, new Cenário(
            "A Compra na Maquininha Duplicada",
            "Você vai pagar a sua compra e, após aproximar o cartão, a maquininha mostra uma mensagem de erro e pede para você tentar novamente, mas o valor no visor mudou.",
            new String[]{
                "Tentar novamente, pois a maquininha pode estar com defeito.",
                "Verificar o valor novamente e pedir para o vendedor digitar o valor correto.",
                "Fazer a compra com dinheiro.",
                "Pedir um novo cartão."
            },
            2,
            " Resposta correta! Você evitou o golpe. A melhor forma de se proteger é sempre verificar o valor no visor da maquininha antes de digitar a senha ou aproximar o cartão.",
            " Resposta incorreta! O golpe pode ser que o valor no visor da maquininha tenha sido alterado para um valor maior do que a sua compra."
        ));
        
        System.out.println(" Simulador de Golpes Financeiros ");
        System.out.println("Bem-vindo! Teste seus conhecimentos e aprenda a se proteger de fraudes.");
        System.out.println("Em cada cenário, você deve escolher a ação correta para evitar o golpe.");

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n---");
            System.out.println("Escolha um cenário para simular:");
            
            
            for (Map.Entry<Integer, Cenário> entry : cenarios.entrySet()) {
                System.out.println(entry.getKey() + ". " + entry.getValue().titulo);
            }
            System.out.println("0. Sair");
            
            System.out.print("\nSua opção: ");
            
            try {
                opcao = scanner.nextInt();
                
                if (opcao == 0) {
                    System.out.println("\nObrigado por jogar! Mantenha-se sempre vigilante.");
                    break;
                }

                if (cenarios.containsKey(opcao)) {
                    Cenário cenarioSelecionado = cenarios.get(opcao);
                    System.out.println("\n---");
                    System.out.println(" Cenário de Risco: " + cenarioSelecionado.titulo + " ");
                    System.out.println("\n" + cenarioSelecionado.descricao);
                    System.out.println("\n---");
                    System.out.println("O que você faz? Escolha uma das opções abaixo:");
                    
                    for (int i = 0; i < cenarioSelecionado.opcoes.length; i++) {
                        System.out.println((i + 1) + ". " + cenarioSelecionado.opcoes[i]);
                    }
                    
                    System.out.print("\nSua escolha: ");
                    int escolha = scanner.nextInt();
                    
                    System.out.println("\n---");
                    if (escolha == cenarioSelecionado.opcaoCorreta) {
                        System.out.println(cenarioSelecionado.feedbackCorreto);
                    } else {
                        System.out.println(cenarioSelecionado.feedbackIncorreto);
                        System.out.println("\nA resposta correta seria: " + cenarioSelecionado.opcoes[cenarioSelecionado.opcaoCorreta - 1]);
                    }
                } else {
                    System.out.println("Opção inválida. Por favor, digite um número da lista.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, digite um número.");
                scanner.next(); // Limpa o buffer do scanner
            }
        }
        scanner.close();
    }
}