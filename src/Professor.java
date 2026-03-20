public class Professor extends Pessoa {

    private double salarioBase;
    private int horasExtras;

    public Professor(String nome, int idade, double salarioBase, int horasExtras) {
        super(nome, idade);
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
    }

    // Sobrescrita
    @Override
    public String getTipo() {
        return "Professor";
    }

    public double calcularSalario() {
        return salarioBase + (horasExtras * 50);
    }

    // Sobrecarga (com bônus)
    public double calcularSalario(double bonus) {
        return calcularSalario() + bonus;
    }

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Tipo: " + getTipo());
        System.out.println("Salário: " + calcularSalario());
    }
}