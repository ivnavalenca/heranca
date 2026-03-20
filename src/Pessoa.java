public class Pessoa {
    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    // Método que será sobrescrito
    public String getTipo() {
        return "Pessoa";
    }

    // Sobrecarga
    public String getTipo(String detalhe) {
        return "Pessoa - " + detalhe;
    }
}