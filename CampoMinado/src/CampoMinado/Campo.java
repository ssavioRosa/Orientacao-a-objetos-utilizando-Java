package CampoMinado;

public class Campo {

    String[][] m = {{"1", "2", "3"},
                    {"4", "5", "6"},
                    {"7", "8", "9"}};

    
    //exibe o campo
    public String exibir() {
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.printf("  " + m[linha][coluna]);
            }
            System.out.println("\n");
        }
        return null;
    }

    //verifica se o campo ja esta preenchido
    public boolean valido(String posicao) {
        for (int linha = 0; linha<3; linha++) {
            for (int coluna = 0; coluna<3; coluna++) {
                if (m[linha][coluna].equals(posicao))
                    return true;
            }
        }
        return false;
    }

    
    public void jogada(String posicao, String jogando) {
    	switch(posicao) {
    	
    	case "1": m[0][0] = jogando;break;
    	case "2": m[0][1] = jogando;break;
    	case "3": m[0][2] = jogando;break;
    	case "4": m[1][0] = jogando;break;
    	case "5": m[1][1] = jogando;break; 
    	case "6": m[1][2] = jogando;break;   
    	case "7": m[2][0] = jogando;break;
    	case "8": m[2][1] = jogando;break;
    	case "9": m[2][2] = jogando;break;
    	
    	}
       
    }
    
    //assumindo que a verificacao de empate com 9 jogadas em campo
    public String Win(int jogadas) {
    	
        String[] vetorVencedor = new String[8];
        String vencedor = "null";
        if (jogadas == 9) {
            vencedor = "EMPATE ";

        }
        vetorVencedor[0] = m[0][0] + m[0][1] + m[0][2];//linha 1
        vetorVencedor[1] = m[1][0] + m[1][1] + m[1][2];//linha 2
        vetorVencedor[2] = m[2][0] + m[2][1] + m[2][2];//linha 3

        vetorVencedor[3] = m[0][0] + m[1][0] + m[2][0];//coluna 1 
        vetorVencedor[4] = m[0][1] + m[1][1] + m[2][1];//coluna 2
        vetorVencedor[5] = m[0][2] + m[1][2] + m[2][2];//coluna 3

        vetorVencedor[6] = m[0][0] + m[1][1] + m[2][2];//diagonal
        vetorVencedor[7] = m[0][2] + m[1][1] + m[2][0];//diagonal

        for (int i = 0; i < vetorVencedor.length; i++) {
            if (vetorVencedor[i].equals("XXX")) {
                vencedor = "Jogador 1";
            } else if (vetorVencedor[i].equals("OOO")) {
                vencedor = "Jogador 2";
            }
        }
        return vencedor;
    }

}
