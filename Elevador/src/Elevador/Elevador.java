package Elevador;

public abstract class Elevador {
    protected int andar_atual;
    protected int total_andar;
    protected int capaciidade_elevador;


    public Elevador(int andar_atual, int total_andar, int capaciidade_elevador) {
        this.andar_atual = andar_atual;
        this.total_andar = total_andar;
        this.capaciidade_elevador = capaciidade_elevador;
    }


    public int getAndar_atual() {
        return andar_atual;
    }


    public void setAndar_atual(int andar_atual) {
        this.andar_atual = andar_atual;
    }


    public int getTotal_andar() {
        return total_andar;
    }


    public void setTotal_andar(int total_andar) {
        this.total_andar = total_andar;
    }


    public int getCapaciidade_elevador() {
        return capaciidade_elevador;
    }


    public void setCapaciidade_elevador(int capaciidade_elevador) {
        this.capaciidade_elevador = capaciidade_elevador;
    }

    public void inicializa(){
        if (this.andar_atual == 0 && this.capaciidade_elevador == 0) {
            System.out.println("Inicializando");
            
        }else{
            System.out.println("Elevador nao pode iniciar");
        }
        
    }
    
    public void entra(int pessoasElevador) {
        pessoasElevador+= pessoasElevador;
        if (pessoasElevador > 0 && pessoasElevador <= this.capaciidade_elevador) {
            System.out.println("Pessoa adicionada!\nTotal de pessoa: " + pessoasElevador);
            
        }else{
            System.out.println("Nao foi possivel adicionar !");
        }
        
    }
    public void sai(int pessoasElevador) {
        if (pessoasElevador >= 0) {
            pessoasElevador--;
            System.out.println("Pessoa removida!\nTotal de pessoas: " + pessoasElevador);
        }else{
            System.out.println("Nao foi possivel remover !");
        }
        
    }
    public void sobe() {
        if (andar_atual >= 0 && andar_atual <= total_andar) {
            andar_atual++;
            System.out.println("Subindo um andar!\nAndar atual: "+ andar_atual);   
        }else{
            System.out.println("Nao foi possivel subir andar!");
        }
        
    }
    public void desce() {
        if (andar_atual > 0 ) {
            andar_atual--;
            System.out.println("Descendo andar!\nAndar atual: "+ andar_atual);
        }else{
            System.out.println("Nao foi possivel descer!");
        }
        
    }
    
    
}
