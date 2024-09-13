public class ContaBancaria {
    String numeroConta;
    String titular;
    int saldo;
    GeradorDeCodigo codeGenerator;

    // Constructor that receives the name of the holder
    public ContaBancaria(String nome) {
        this.numeroConta = GeradorDeCodigo.gerarCodigo(); // Access the static method directly using the class name
        this.titular = nome;
        this.saldo = 0; // Balance initialized to 0 or another default value
    }

    // Método para exibir informações da conta
    public void mostrarDados() {
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }

    // Método para depositar dinheiro na conta
    public void depositar(int valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para sacar dinheiro da conta
    public void sacar(int valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saque inválido. Saldo insuficiente ou valor inválido.");
        }
    }

    // Método para obter o saldo atual
    public int getSaldo() {
        return saldo;
    }
}
