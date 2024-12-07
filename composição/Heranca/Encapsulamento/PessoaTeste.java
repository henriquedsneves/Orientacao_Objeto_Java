package Heranca.Encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setIdade(-30);
        p1.setNome("Henrique");
        System.out.println(p1.getIdade());
        System.out.println(p1.getNome());
        
    }

}
