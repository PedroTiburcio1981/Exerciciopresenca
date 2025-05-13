public class ExercicioConta {
    public static void main(String[] args) {
        Conta minhaConta = new Conta(1500.75, 500.00);

        Cliente cliente1 = new Cliente("João Silva", "111.222.333-44");
        Cliente cliente2 = new Cliente("Maria Oliveira", "555.666.777-88");

        minhaConta.adicionaCliente(cliente1);
        minhaConta.adicionaCliente(cliente2);
        minhaConta.adicionaCliente(null);

        minhaConta.mostraInfo();

        System.out.println("\nPrograma executado até o final.");
    }
}
