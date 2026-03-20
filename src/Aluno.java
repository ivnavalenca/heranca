public class Aluno extends Pessoa {

    private double nota1;
    private double nota2;

    public Aluno(String nome, int idade, double nota1, double nota2) {
        super(nome, idade);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // Sobrescrita (override)
    @Override
    public String getTipo() {
        return "Aluno";
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    // Sobrecarga (com peso)
    public double calcularMedia(double peso1, double peso2) {
        return (nota1 * peso1 + nota2 * peso2) / (peso1 + peso2);
    }

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Tipo: " + getTipo());
        System.out.println("Média: " + calcularMedia());
    }
}