package BasicoObjetos;

public class Guerreiro {

    protected String nome;
    protected String arma;
    protected int energia;
    protected String armadura;


    public Guerreiro(String nome, String arma, String armadura) {
        this.nome = nome;
        this.arma = arma;
        this.energia = 20;
        this.armadura = armadura;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getArma() {
        return arma;
    }


    public void setArma(String arma) {
        this.arma = arma;
    }


    public int getEnergia() {
        return energia;
    }

    public String getArmadura() {
        return armadura;
    }


    public void setArmadura(String armadura) {
        this.armadura = armadura;
    }

    public void ataca(Guerreiro guerreiro) {
        if ((guerreiro.armadura != null) && (guerreiro.arma != null)) {
            this.energia -= 5;
        }
        
    }

    

    


    
}
