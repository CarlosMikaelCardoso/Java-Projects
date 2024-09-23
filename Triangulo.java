public class Triangulo {
    int base;
    int altura;

    Triangulo (int base, int altura){
        this.altura = altura;
        this.base = base;
    }


    public int calculaArea(){
        return (base * altura) / 2;
    }

}
