package Heranca;

public class Jogo {
    public static void main(String[] args) {
        Jogadro j1 = new Jogador();
        j1.x = 10;
        j1.y = 20;

        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.LESTE);
        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.NORTE);
        
        System.out.println(j1.y);
    }
    
}
