package Heranca.Testes;

import Heranca.Desafio.Civic;
import Heranca.Desafio.Ferrari;

public class CarroMain {
    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari();

        Civic civic = new Civic();
        System.out.println("velocidade Ferrari: " + ferrari.velocidade);
        
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.desligarTurbo();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.ligarTurbo();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.desligarTurbo();
        ferrari.acelerar();
        
        System.out.println("velocidade civic: " + civic.velocidade);

        
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();

        System.out.println("velocidade Ferrari: " + ferrari.velocidade);
        System.out.println("velocidade civic: " + civic.velocidade);

    }

}
