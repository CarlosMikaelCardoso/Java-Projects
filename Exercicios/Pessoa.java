package Exercicios;
public class Pessoa {
    String nome;
    int idade;
    double altura;


    Pessoa (String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void infoPessoa(){
        System.out.println("Nome : " + nome);
        System.out.println("Idade : " + idade);
        System.out.println("Altura : " + altura);
    }
}

