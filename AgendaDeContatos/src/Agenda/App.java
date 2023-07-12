import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        boolean sairPrograma = false;
        ListaContatos lista = new ListaContatos();
        
        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("\t***MENU***\n");
            do {
                System.out.println("####################################################");
                System.out.println("[1] - Adicionar Contatos\n[2] - Buscar Contatos \n[3] - Remover Contatos\n[4] - Mostrar Contatos\n[5] - Sair");
                System.out.println("####################################################");
                System.out.println("Digite a operação Desejada -> ");

                int escolha = scan.nextInt();

                if (escolha == 5) {
                    sairPrograma = true;
                }
                else if (escolha == 1) {
                    System.out.println("\t***Armazena Contato***\n");
                    System.out.println("Digite o nome -> ");
                    String nome = scan.next();
                    System.out.println("Digite o numero ->");
                    String numero = scan.next();
                    System.out.println("Digite o e-mail ->");
                    String email = scan.next();
                    
                    lista.armazenaPessoa(nome, numero, email);
                }
                else if (escolha == 2) {
                    System.out.println("\t***Buscar Contatos***\n");
                    System.out.println("Digite o nome do contatro que deseja buscar -> ");
                    String buscaContato = scan.next();
                    lista.buscaPessoa(buscaContato);
                }
                else if (escolha == 3) {
                    System.out.println("\t***Remover contato***\n");
                    System.out.println("Digite o nome do contato que deseja remover -> ");
                    String removerContato = scan.next();
                    lista.removePessoa(removerContato);
                }
                else if (escolha == 4) {
                    lista.imprimeAgenda();
                }


            } while (sairPrograma != true);

            System.out.println("Saindo...");
            
            


































        }


        
    }
    
}
