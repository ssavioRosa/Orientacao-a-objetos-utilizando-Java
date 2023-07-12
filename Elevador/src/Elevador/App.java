package Elevador;

public class App {
    public static void main(String[] args) {

        Elevador comercial = new ElevadorComercial(0, 0, 0);

        comercial.inicializa();

        comercial.setCapaciidade_elevador(5);
        comercial.setTotal_andar(30);

        comercial.entra(3);
        comercial.sobe();
        comercial.sai(2);
        comercial.entra(1);
        comercial.desce();



        
    }
}
