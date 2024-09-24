import java.util.ArrayList;

public class Banco {
    // Lista para armazenar todas as contas bancárias
    private ArrayList<ContaBancaria> contas;

    // Construtor da classe Banco
    public Banco() {
        contas = new ArrayList<>();
    }

    // Método para adicionar uma nova conta
    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
    }

    // Método para buscar uma conta pelo nome do titular
    public ContaBancaria buscarConta(String nome) {
        for (ContaBancaria conta : contas) {
            if (conta.titular.equals(nome)) {
                return conta;
            }
        }
        return null; // Retorna null se a conta não for encontrada
    }

    // Método para listar todas as contas
    public void listarContas() {
        for (ContaBancaria conta : contas) {
            conta.mostrarDados();
        }
    }
}
