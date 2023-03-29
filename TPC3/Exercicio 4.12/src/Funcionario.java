public class Funcionario {
     String nome;
      String departamento;
     double salario;
     String dataDeEntradaNoBanco;
     String RG;

    public Funcionario(String nome, String departamento, double salario, String dataDeEntradaNoBanco, String RG) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.dataDeEntradaNoBanco = dataDeEntradaNoBanco;
        this.RG = RG;
    }
    void recebeAumento(double aumento){

    }
    double calculaGanhoAnual(){
        return salario *12;
    }
}
