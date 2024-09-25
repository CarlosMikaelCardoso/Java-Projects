package Exercicios;
public class Main_banco {
    public static void main(String[] args) {
        // Criação de novas contas
        ContaBancaria funcionario1 = new ContaBancaria("Mikael");
        ContaBancaria funcionario2 = new ContaBancaria("Ana");

        // Exibindo os dados das contas
        funcionario1.mostrarDados();
        funcionario2.mostrarDados();

        // Realizando depósitos
        funcionario1.depositar(500); // Depósito de R$500
        funcionario2.depositar(300); // Depósito de R$300

        // Realizando saques
        funcionario1.sacar(200); // Saque de R$200
        funcionario2.sacar(400); // Tentativa de saque de R$400 (saldo insuficiente)

        // Exibindo os dados atualizados das contas
        funcionario1.mostrarDados();
        funcionario2.mostrarDados();
    }
}
