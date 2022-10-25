package Treino;

public class Exec {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.exibir();
        f1.aumentarSalario(70);
        f1.exibir();

        Professor p = new Professor();
        p.exibir();
        p.aumentarSalario(40);
        p.exibir();

    }
}
