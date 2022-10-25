package Treino;

public class Funcionario {

        private String nome;
        private String funcao;
        private double salario;
        private int numFuncionarios;

        public Funcionario() {
            this.nome = "Joao";
            this.funcao = "secretario";
            this.salario = 2000;
            this.numFuncionarios = 1;
        }

        public void aumentarSalario(double perce) {
            perce = perce / 100;

            this.setSalario(this.salario + (this.getSalario() * perce));
            System.out.printf("Seu aumento é: %.2f %n", this.getSalario());
            System.out.println();

        }

        public void exibir() {
            System.out.println("Nome: " + this.getNome());
            System.out.println("Função: " + this.getFuncao());
            System.out.println("Salario: " + this.getSalario() + " R$");
            System.out.println("Numero de funcionarios: " + this.getNumFuncionarios());
            System.out.println();

        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getFuncao() {
            return funcao;
        }

        public void setFuncao(String funcao) {
            this.funcao = funcao;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }

        public int getNumFuncionarios() {
            return numFuncionarios;
        }

        public void setNumFuncionarios(int numFuncionarios) {
            this.numFuncionarios = numFuncionarios;
        }
}


