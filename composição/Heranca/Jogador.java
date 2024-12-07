package Heranca;

public class Jogador {
    public int vida = 100;
    public int x;
    public int y;
    public  boolean Atacar(Jogador oponente){
     int DeltaX =  Math.abs(x - oponente.x);
     int DeltaY =  Math.abs(y - oponente.y);

        if (DeltaX == 0 && DeltaY ==1){
            oponente.vida -= 10;
            return true;
        }else if (DeltaX == 1 && DeltaY == 0){
            oponente.vida -=10;
            return true;
        }else{
            return false;

        }


    }

    public boolean andar (Direcao direcao){
        switch(direcao){
            case NORTE:
            y--;
            break;
            case LESTE:
            x++;
            break;
            case SUL:
            y++;
            break;
            case OESTE:
            x--;
            break;
        }
        return true;
    }
    
}
