package Treino;

public class Professor extends Funcionario {
    private int numDiciplinas;

    public Professor() {
        this.setNome("Leandro");
        this.setFuncao("Professor");
        this.setSalario(4000);
        this.setNumFuncionarios(1);
        this.setNumDiciplinas(2);
    }

    @Override
    public void aumentarSalario(double perce) {
        perce = perce /100;

        this.setSalario(this.getSalario() +(this.getSalario() * perce)+ 100);
        System.out.printf("Seu aumento é: %.2f %n", this.getSalario());
        System.out.println();

    }

    @Override
    public void exibir() {
        System.out.println("Nome: " +this.getNome());
        System.out.println("Função: " +this.getFuncao());
        System.out.println("Numero de diciplinas :" + this.getNumDiciplinas());
        System.out.println("Salario: " +this.getSalario()+" R$");
        System.out.println("Numero de funcionarios: " +this.getNumFuncionarios());
        System.out.println();
    }

    public int getNumDiciplinas() {
        return numDiciplinas;
    }

    public void setNumDiciplinas(int numDiciplinas) {
        this.numDiciplinas = numDiciplinas;
    }
}
