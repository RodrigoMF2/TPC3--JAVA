class TestaFuncionario {

         public static void main(String[] args) {
         Funcionario f1 = new Funcionario();

         f1.nome = "Hugo";
         f1.salario = 100;
         f1.recebeAumento(50);

         System.out.println("salario atual:" + f1.salario);
         System.out.println("ganho anual:" + f1.calculaGanhoAnual());
         }