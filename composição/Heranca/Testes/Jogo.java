package Heranca.Testes;

import Heranca.Jogador;

public class Jogo {
    public static void main(String[] args) {
        Jogador Monstro = new Jogador();
        Monstro.x = 10;
        Monstro.y = 10;
        
        Jogador Heroi = new Jogador();
        Heroi.x = 10;
        Heroi.y = 11;

        //j2.andar(Direcao.NORTE);
         //j2.andar(Direcao.LESTE);
         //j2.andar(Direcao.NORTE);
         //j2.andar(Direcao.NORTE);
         //j2.andar(Direcao.NORTE);
        
        //System.out.println(j2.y);
        System.out.println("vida j1 " + Monstro.vida);
        System.out.println("vida J2 " + Heroi.vida);
        
        Monstro.Atacar(Heroi);
        Heroi.Atacar(Monstro);
        System.out.println("vida j2 "  + Heroi.vida);
        System.out.println("vida j1 "+ Monstro.vida);
    }
    
}
