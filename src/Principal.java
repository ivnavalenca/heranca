public class Principal {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("João", 20, 8.0, 7.0);
        Professor professor = new Professor("Maria", 40, 3000, 10);

        System.out.println("=== ALUNO ===");
        aluno.exibirDados();
        System.out.println("Média com peso: " + aluno.calcularMedia(2, 3));

        System.out.println("\n=== PROFESSOR ===");
        professor.exibirDados();
        System.out.println("Salário com bônus: " + professor.calcularSalario(500));
    }
}