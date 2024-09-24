package Exercicios;
public class Retangulo {
    int base;
    int altura;

    Retangulo (int base, int altura){
        this.altura = altura;
        this.base = base;
    }


    public int calculaArea(){
        return (base * altura) / 2;
    }

}
