# Exercicio Orientação a Objeto

Exercicio 1

a) Construir a classe Funcionário:
i) variáveis de instância (visibilidade privada):
 Nome ( String nome)
 Função (String funcao)
 Salário (double salario)
ii) variável estática (visibilidade privada):
 Quantidade de Funcionários (int numFuncionarios)
iii) Métodos públicos
 Construtor default;
 Construtor com três parâmetros, cada um deverá receber valores que irão iniciar cada variável
de instância;
 Métodos set e get para o acesso às variáveis;
 aumentarSalario, que recebe um percentual de aumento e faz o cálculo;
 exibir, para a visualização dos valores das variáveis de instância;


b) Construir a classe Professor:
i) herdar da classe Funcionário;
ii) Métodos Públicos:
 Construtor default (padrão), onde o número mínimo de disciplinas é 2;
 Um construtor com parâmetros (com valores para as variáveis de instância da classe
Funcionário e um valor para o número de disciplinas) que inicie todas as variáveis de instância
e chame, para ajudá-lo nisso, o construtor da classe base (superclasse);
 Sobrescrever o método aumentarSalario, acrescentando ao percentual de aumento do
Professor, um bônus de R$ 100,00 para cada disciplina que o mesmo leciona;
 Sobrescrever o método exibir, para a visualização dos valores das variáveis de instância.

c) Crie a classe Escola para testar as classes acima, onde, essa classe, terá tanto uma instância de
Funcionário, quanto uma instância de Professor. Execute os métodos sobrescritos aumentarSalario
e exibir


