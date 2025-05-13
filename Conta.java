import java.util.HashSet;
import java.util.Set;

public class Conta {
    double saldo;
    double limite;
    Set<Cliente> clientes;

    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
        this.clientes = new HashSet<>();
    }

    public void adicionaCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void mostraInfo() {
        System.out.println("Informações da Conta:");
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);
        System.out.println("\nInformações dos Clientes Associados:");

        if (clientes.isEmpty()) {
            System.out.println("Não há clientes associados a esta conta.");
        } else {
            for (Cliente cliente : clientes) {
                try {
                    System.out.println("- " + cliente.getInfoCliente());
                } catch (NullPointerException e) {
                    System.out.println("- Um dos objetos cliente é nulo e não pode ter suas informações exibidas.");
                }
            }
        }
    }
}
