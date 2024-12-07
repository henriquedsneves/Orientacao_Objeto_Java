package Heranca.Encapsulamento;

public class Pessoa {
    private int idade;
    private String nome;



    public int getIdade() {
        return idade;
    }
    public void setIdade(int novaidade) {
        novaidade = Math.abs(novaidade);
        if(novaidade >= 0 && novaidade <= 120){

            this.idade = novaidade;

        }
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void Teste(){

    }

}
