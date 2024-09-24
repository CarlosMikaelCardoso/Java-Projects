import java.util.Scanner;

public class Carro {
    String modelo;
    String cor;
    Scanner scanner = new Scanner(System.in);

    Carro(String model, String color) {
        this.modelo = model;
        this.cor = color;
    }

    public void stateCar() {
        String states;
        System.out.println("Ligar Carro? S ou N");
        states = scanner.nextLine();
        
        if (states.equals("S")) {
            System.out.println("O " + modelo + " " + cor + " está ligado");
        } else if (states.equals("N")) {
            System.out.println("O carro está desligado");
        } else {
            System.out.println("Letra não reconhecida");
        }
    }
}
