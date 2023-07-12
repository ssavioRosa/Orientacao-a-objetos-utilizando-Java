package BasicoObjetos;

public class Principal {
    public static void main(String[] args) {

        Guerreiro guerreiro1 = new Guerreiro("Hercules", null,null );
        Guerreiro guerreiro2 = new Guerreiro("Aquiles", null, "De aço");

        guerreiro1.ataca(guerreiro2);
        guerreiro2.ataca(guerreiro1);

        guerreiro1.setArmadura("De Ferro");
        guerreiro1.setArma("Machado");

        guerreiro1.ataca(guerreiro2);

        guerreiro2.setArma(null);

        guerreiro2.ataca(guerreiro1);

        System.out.println("[Energia do guerreiro 1]" + guerreiro1.getEnergia());
        System.out.println("[Energia do guerreiro 2]" + guerreiro2.getEnergia());

        





        


        
    }
    
}
