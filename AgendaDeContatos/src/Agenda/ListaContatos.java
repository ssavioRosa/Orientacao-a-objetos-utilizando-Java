import java.util.ArrayList;
import java.util.List;

public class ListaContatos implements Agenda {

    List<Contatos> lista = new ArrayList<>();

    @Override
    public void armazenaPessoa(String nome, String telefone, String email) {
        // TODO Auto-generated method stub
        Contatos contatosTemp = new Contatos(nome, telefone, email);

        lista.add(contatosTemp);
        System.out.println("\t\n***Contato adicionado com sucesso***\n");
    }

    @Override
    public String buscaPessoa(String nome) {
        // TODO Auto-generated method stub
        for (Contatos contatos : lista) {
            if (contatos.nomeContato.equals(nome)) {
                System.out.println("\t\n***Contato encontrado com sucesso***\n");
                System.out.println(contatos.toString());
            }
            
        }
        return null;
    }

    @Override
    public void imprimeAgenda() {
        // TODO Auto-generated method stub
        System.out.println("\t\n***Todos os contatos***\n");
        System.out.println("Total contatos -> " +lista.size());
        for (Contatos contatos : lista) {
            System.out.println(contatos.toString());
        }
    }

    @Override
    public void removePessoa(String nome) {
        // TODO Auto-generated method stub
      
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).nomeContato.equals(nome)) {
                    
                    lista.remove(i);
                }
                
            }
        System.out.println("\t\n***Contato removido com sucesso***\n");
    }
    
    
}
