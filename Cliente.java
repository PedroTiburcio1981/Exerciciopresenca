public class Cliente {
    String nome;
    String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getInfoCliente() {
        return "Nome: " + nome + ", CPF: " + cpf;
    }
}
