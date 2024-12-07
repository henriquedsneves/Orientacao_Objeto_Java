package Heranca.Desafio;

public class Ferrari extends Carro implements Esportivo{
    public Ferrari(){
        super(300);
    

    }

    @Override
    public void ligarTurbo() {
        Delta = 35;
    }

    @Override
    public void desligarTurbo() {
       this.Delta = 15;
    }
}
