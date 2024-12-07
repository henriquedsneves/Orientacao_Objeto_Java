package Heranca.Desafio;

public class Carro {

public  int velocidade;
public final int VELOCIDADE_MAX;
protected int Delta = 5;

protected Carro (int velocidadeMax){
    VELOCIDADE_MAX = velocidadeMax;
}
public void acelerar(){
    if (velocidade + Delta > VELOCIDADE_MAX){
        velocidade = VELOCIDADE_MAX;
    }else{
        velocidade += Delta;
    }
}
public void frear(){
    if (velocidade >= Delta){
        velocidade -= Delta;
    }else{
        velocidade = 0;
    }
}


}