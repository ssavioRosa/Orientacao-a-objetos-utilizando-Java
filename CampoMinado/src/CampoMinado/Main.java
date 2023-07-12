package CampoMinado;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            //instanciar
            Campo jogo = new Campo();
            String posicao;
            int valida = 0;
            int jogadas = 0;

            while(jogadas<=9) {
                jogo.exibir();

                do {
                    System.out.print("Jogador 1, Escolha uma posição: ");
                    posicao = ler.next();
                    while (!jogo.valido(posicao)) {
                        System.out.println("Jogada invalida, tente novamente !");
                        System.out.print("Jogador 1, Escolha uma posição: ");
                        posicao = ler.next();
                        valida = 0;
                    }
                    jogo.jogada(posicao, "X");
                    valida = 1;

                } while (valida == 0);

                jogadas++;
                valida = 0;
                jogo.exibir();
                
                //checa se com a jogada do jogador 1 ele vence, nao tem necessidade do prox jogador jogar
                if (!jogo.Win(jogadas).equals("null")) {
                    break;
                }

                do {
                    System.out.print("Jogador 2, Escolha uma posição: ");
                    posicao = ler.next();
                    while (!jogo.valido(posicao)) {
                        System.out.println("Jogada invalida, tente novamente !");
                        System.out.print("Jogador 2, Escolha uma posição: ");
                        posicao = ler.next();
                        valida = 0;
                    }
                    jogo.jogada(posicao, "O");
                    valida = 1;

                } while (valida == 0);
                
                jogadas++;
                valida = 0;
                jogo.exibir();
                if (!jogo.Win(jogadas).equals("null")) {
                    break;
                }
                
                
            }
            System.out.println("O "+jogo.Win(jogadas)+" ganhou ");
        }
    }
}
