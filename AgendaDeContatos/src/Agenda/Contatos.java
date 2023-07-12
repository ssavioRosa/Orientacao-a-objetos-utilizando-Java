public class Contatos {

    String nomeContato;
    String numeroDeTelefone;
    String email;


    public Contatos(String nome, String numeroDeTelefone, String email) {
        this.nomeContato = nome;
        this.numeroDeTelefone = numeroDeTelefone;
        this.email = email;
    }


    public String getNome() {
        return nomeContato;
    }


    public void setNome(String nome) {
        this.nomeContato = nome;
    }

    
    public String getNumeroDeTelefone() {
        return numeroDeTelefone;
    }


    public void setNumeroDeTelefone(String numeroDeTelefone) {
        this.numeroDeTelefone = numeroDeTelefone;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "\nNome -> " + nomeContato + "\nNumero de telefone -> " + numeroDeTelefone + "\nEmail -> " + email + "\n";
    }

    
   


    
    
}
