public class Calculadora_main {
    public static void main(String[] args) {
        Calculadora myCalculadora = new Calculadora();
        
        System.out.println(myCalculadora.add(5, 7));
        System.out.println(myCalculadora.substract(45, 11));
        System.out.println(myCalculadora.division(4, 8));
        System.out.println(myCalculadora.modulo(5, 10));
        System.out.println(myCalculadora.multiply(10, 987));
    }
}
