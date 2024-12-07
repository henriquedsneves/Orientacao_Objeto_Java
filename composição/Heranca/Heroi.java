package Heranca;

public class Heroi extends Jogador {

    public boolean Atacar(Jogador oponente){
        int DeltaX =  Math.abs(x - oponente.x);
        int DeltaY =  Math.abs(y - oponente.y);

        if (DeltaX == 0 && DeltaY ==1){
            oponente.vida -= 20;
            return true;
        }else if (DeltaX == 1 && DeltaY == 0){
            oponente.vida -=20;
            return true;
        }else{
            return false;

        }

    }
}
