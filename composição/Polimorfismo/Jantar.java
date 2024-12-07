package Polimorfismo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa convidado = new Pessoa(75);
        Arroz alimento1 = new Arroz(0.1);
        Feijao alimento2 = new Feijao(0.2);
        Sorvete sobremesa = new Sorvete(0.4);
        System.out.println(convidado.getPeso());
        convidado.Comer(alimento1);
        convidado.Comer(alimento2);
        convidado.Comer(sobremesa);
        System.out.println(convidado.getPeso());
    }

}
