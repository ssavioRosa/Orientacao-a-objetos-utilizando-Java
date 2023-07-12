public interface Agenda {

    void armazenaPessoa(String nome, String telefone, String email); 
    void removePessoa(String nome); 
    String buscaPessoa(String nome); 
    void imprimeAgenda();
    
}
